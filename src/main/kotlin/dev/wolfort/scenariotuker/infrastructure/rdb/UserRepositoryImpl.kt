package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbUserBhv
import dev.wolfort.dbflute.exbhv.DbUserFollowBhv
import dev.wolfort.dbflute.exentity.DbUser
import dev.wolfort.dbflute.exentity.DbUserFollow
import dev.wolfort.scenariotuker.domain.model.user.User
import dev.wolfort.scenariotuker.domain.model.user.UserQuery
import dev.wolfort.scenariotuker.domain.model.user.UserRepository
import dev.wolfort.scenariotuker.domain.model.user.Users
import dev.wolfort.scenariotuker.fw.exception.SystemException
import dev.wolfort.scenariotuker.fw.security.Authority
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val userBhv: DbUserBhv,
    private val userFollowBhv: DbUserFollowBhv
) : UserRepository {

    override fun findAll(): Users {
        val dbUserList = userBhv.selectList {
            it.query().addOrderBy_UserId_Asc()
        }
        loadUserFollow(dbUserList)
        return mappingToUsers(dbUserList)
    }

    override fun findAllByIds(ids: List<Int>): Users {
        if (ids.isEmpty()) return Users(list = emptyList())
        val dbUserList = userBhv.selectList {
            it.query().setUserId_InScope(ids)
        }
        loadUserFollow(dbUserList)
        return mappingToUsers(ids.mapNotNull { id -> dbUserList.find { it.userId == id } })
    }

    override fun search(query: UserQuery): Users {
        val dbUserList = userBhv.selectList {
            if (!query.name.isNullOrEmpty()) {
                it.query().setUserName_LikeSearch(query.name) { op ->
                    op.splitByBlank().likeContain().asOrSplit()
                }
            }
            if (!query.twitterUserName.isNullOrEmpty()) {
                it.query().setTwitterUserName_LikeSearch(query.twitterUserName) { op ->
                    op.splitByBlank().likeContain().asOrSplit()
                }
            }
            it.query().addOrderBy_UserId_Asc()
        }
        loadUserFollow(dbUserList)
        return mappingToUsers(dbUserList)
    }

    override fun findById(id: Int): User? {
        val optDbUser = userBhv.selectEntity {
            it.query().setUserId_Equal(id)
        }
        if (!optDbUser.isPresent) return null
        val dbUser = optDbUser.get()
        userBhv.load(dbUser) {
            it.loadUserFollowByFromUserId { }
            it.loadUserFollowByToUserId { }
        }
        return mappingToUser(dbUser)
    }

    override fun findByUid(uid: String): User? {
        val optDbUser = userBhv.selectEntity {
            it.query().setUid_Equal(uid)
        }
        if (!optDbUser.isPresent) return null
        val dbUser = optDbUser.get()
        userBhv.load(dbUser) {
            it.loadUserFollowByFromUserId { }
            it.loadUserFollowByToUserId { }
        }
        return mappingToUser(dbUser)
    }

    override fun register(user: User): User {
        val u = DbUser()
        u.uid = user.uid
        u.authority = user.authority.name
        u.userName = user.name
        u.twitterUserName = user.twitterUserName
        userBhv.insert(u)
        return findById(u.userId)!!
    }

    override fun update(user: User): User {
        val exists = findByUid(user.uid) ?: throw SystemException("user not found. uid: ${user.uid}")

        val u = DbUser()
        u.userId = exists.id
        u.userName = user.name
        u.twitterUserName = user.twitterUserName
        userBhv.update(u)
        return findByUid(user.uid)!!
    }

    override fun follow(fromId: Int, toId: Int) {
        val exists = userFollowBhv.selectEntity {
            it.query().setFromUserId_Equal(fromId)
            it.query().setToUserId_Equal(toId)
        }
        if (exists.isPresent) return
        val f = DbUserFollow()
        f.fromUserId = fromId
        f.toUserId = toId
        userFollowBhv.insert(f)
    }

    override fun unfollow(fromId: Int, toId: Int) {
        val exists = userFollowBhv.selectEntity {
            it.query().setFromUserId_Equal(fromId)
            it.query().setToUserId_Equal(toId)
        }
        if (!exists.isPresent) return
        userFollowBhv.delete(exists.get())
    }

    private fun loadUserFollow(dbUserList: List<DbUser>) {
        if (dbUserList.isNotEmpty()) {
            userBhv.load(dbUserList) {
                it.loadUserFollowByFromUserId { }
                it.loadUserFollowByToUserId { }
            }
        }
    }

    private fun mappingToUsers(list: List<DbUser>): Users {
        return Users(list = list.map { mappingToUser(it) })
    }

    private fun mappingToUser(user: DbUser): User {
        return User(
            id = user.userId,
            uid = user.uid,
            authority = Authority.valueOf(user.authority),
            name = user.userName,
            twitterUserName = user.twitterUserName,
            follows = user.userFollowByFromUserIdList.map { it.toUserId },
            followers = user.userFollowByToUserIdList.map { it.fromUserId }
        )
    }
}