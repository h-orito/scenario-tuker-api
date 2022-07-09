package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbTwitterUserBhv
import dev.wolfort.dbflute.exbhv.DbUserBhv
import dev.wolfort.dbflute.exentity.DbTwitterUser
import dev.wolfort.dbflute.exentity.DbUser
import dev.wolfort.scenariotuker.domain.model.user.*
import dev.wolfort.scenariotuker.fw.exception.SystemException
import dev.wolfort.scenariotuker.fw.security.Authority
import dev.wolfort.scenariotuker.util.Encryptor
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val userBhv: DbUserBhv,
    private val twitterUserBhv: DbTwitterUserBhv,
    private val encryptor: Encryptor
) : UserRepository {

    override fun findAll(): Users {
        val dbUserList = userBhv.selectList {
            it.setupSelect_TwitterUserAsOne()
            it.query().addOrderBy_UserId_Asc()
        }
        return mappingToUsers(dbUserList)
    }

    override fun findAllByIds(ids: List<Int>): Users {
        if (ids.isEmpty()) return Users(list = emptyList())
        val dbUserList = userBhv.selectList {
            it.setupSelect_TwitterUserAsOne()
            it.query().setUserId_InScope(ids)
        }
        return mappingToUsers(ids.mapNotNull { id -> dbUserList.find { it.userId == id } })
    }

    override fun search(query: UserQuery): Users {
        val dbUserList = userBhv.selectList {
            it.setupSelect_TwitterUserAsOne()
            if (!query.name.isNullOrEmpty()) {
                it.query().setUserName_LikeSearch(query.name) { op ->
                    op.splitByBlank().likeContain().asOrSplit()
                }
            }
            if (!query.screenName.isNullOrEmpty()) {
                it.query().queryTwitterUserAsOne().setScreenName_LikeSearch(query.screenName) { op ->
                    op.splitByBlank().likeContain().asOrSplit()
                }
            }
            it.query().addOrderBy_UserId_Asc()
        }
        return mappingToUsers(dbUserList)
    }

    override fun findById(id: Int): User? {
        val optDbUser = userBhv.selectEntity {
            it.setupSelect_TwitterUserAsOne()
            it.query().setUserId_Equal(id)
        }
        if (!optDbUser.isPresent) return null
        val dbUser = optDbUser.get()
        return mappingToUser(dbUser)
    }

    override fun findByUid(uid: String): User? {
        val optDbUser = userBhv.selectEntity {
            it.setupSelect_TwitterUserAsOne()
            it.query().setUid_Equal(uid)
        }
        if (!optDbUser.isPresent) return null
        val dbUser = optDbUser.get()
        return mappingToUser(dbUser)
    }

    override fun register(user: User): User {
        val u = DbUser()
        u.uid = user.uid
        u.authority = user.authority.name
        u.userName = user.name
        userBhv.insert(u)
        val userId = u.userId
        val t = DbTwitterUser()
        t.userId = userId
        t.twitterId = user.twitter.id
        t.screenName = user.twitter.screenName
        t.accessToken = encryptor.encrypt(user.twitter.accessToken)
        t.tokenSecret = encryptor.encrypt(user.twitter.tokenSecret)
        twitterUserBhv.insert(t)
        return findById(userId)!!
    }

    override fun update(user: User): User {
        val exists = findByUid(user.uid) ?: throw SystemException("user not found. uid: ${user.uid}")
        val u = DbUser()
        u.userId = exists.id
        u.userName = user.name
        userBhv.update(u)
        upsertTwitter(user)
        return findByUid(user.uid)!!
    }

    private fun upsertTwitter(user: User) {
        val exists = twitterUserBhv.selectEntity {
            it.query().setUserId_Equal(user.id)
        }
        val t = if (exists.isPresent) exists.get() else DbTwitterUser()
        t.userId = user.id
        user.twitter.let {
            t.twitterId = it.id
            t.screenName = it.screenName
            t.accessToken = encryptor.encrypt(it.accessToken)
            t.tokenSecret = encryptor.encrypt(it.tokenSecret)
        }
        twitterUserBhv.insertOrUpdate(t)
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
            twitter = user.twitterUserAsOne.get().let {
                TwitterUser(
                    id = it.twitterId,
                    screenName = it.screenName,
                    accessToken = encryptor.decrypt(it.accessToken),
                    tokenSecret = encryptor.decrypt(it.tokenSecret)
                )
            }
        )
    }
}