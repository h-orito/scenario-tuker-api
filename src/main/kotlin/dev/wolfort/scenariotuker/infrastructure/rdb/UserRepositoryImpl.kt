package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbTwitterUserBhv
import dev.wolfort.dbflute.exbhv.DbUserBhv
import dev.wolfort.dbflute.exbhv.DbUserRuleBookBhv
import dev.wolfort.dbflute.exbhv.DbUserScenarioBhv
import dev.wolfort.dbflute.exentity.DbTwitterUser
import dev.wolfort.dbflute.exentity.DbUser
import dev.wolfort.dbflute.exentity.DbUserRuleBook
import dev.wolfort.dbflute.exentity.DbUserScenario
import dev.wolfort.scenariotuker.domain.model.user.*
import dev.wolfort.scenariotuker.fw.exception.SystemException
import dev.wolfort.scenariotuker.fw.security.Authority
import dev.wolfort.scenariotuker.util.Encryptor
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val userBhv: DbUserBhv,
    private val twitterUserBhv: DbTwitterUserBhv,
    private val userRuleBookBhv: DbUserRuleBookBhv,
    private val userScenarioBhv: DbUserScenarioBhv,
    private val encryptor: Encryptor,
    private val twitterRepository: TwitterRepository
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

    override fun findAllByRuleBookIds(ruleBookId: Int): Users {
        val dbUserList = userBhv.selectList {
            it.setupSelect_TwitterUserAsOne()
            it.query().existsUserRuleBook { urCB ->
                urCB.query().setRuleBookId_Equal(ruleBookId)
            }
            it.query().addOrderBy_UserId_Asc()
        }
        return mappingToUsers(dbUserList)
    }

    override fun search(query: UserQuery, user: User?): Users {
        val followings = if (query.isTwitterFollowing == true && user != null) {
            twitterRepository.getFollowings(user.twitter)
        } else emptyList()

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
            if (followings.isNotEmpty()) {
                it.query().queryTwitterUserAsOne()
                    .setTwitterId_InScope(followings.map { twitterUser -> twitterUser.id })
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
        u.introduction = user.introduction
        userBhv.update(u)
        upsertTwitter(user.copy(id = exists.id))
        return findByUid(user.uid)!!
    }

    override fun registerUserRuleBook(id: Int, ruleBookId: Int) {
        val existing = userRuleBookBhv.selectEntity {
            it.query().setUserId_Equal(id)
            it.query().setRuleBookId_Equal(ruleBookId)
        }
        if (existing.isPresent) return
        val ur = DbUserRuleBook()
        ur.userId = id
        ur.ruleBookId = ruleBookId
        userRuleBookBhv.insert(ur)
    }

    override fun deleteUserRuleBook(id: Int, ruleBookId: Int) {
        userRuleBookBhv.queryDelete {
            it.query().setUserId_Equal(id)
            it.query().setRuleBookId_Equal(ruleBookId)
        }
    }

    override fun updateUserRuleBook(sourceRuleBookId: Int, destRuleBookId: Int) {
        userRuleBookBhv.selectList {
            it.query().setRuleBookId_Equal(sourceRuleBookId)
        }.forEach { userRuleBook ->
            val userId = userRuleBook.userId
            deleteUserRuleBook(userId, sourceRuleBookId)
            registerUserRuleBook(userId, destRuleBookId)
        }
    }

    override fun registerUserScenario(id: Int, scenarioId: Int) {
        val existing = userScenarioBhv.selectEntity {
            it.query().setUserId_Equal(id)
            it.query().setScenarioId_Equal(scenarioId)
        }
        if (existing.isPresent) return
        val us = DbUserScenario()
        us.userId = id
        us.scenarioId = scenarioId
        userScenarioBhv.insert(us)
    }

    override fun deleteUserScenario(id: Int, scenarioId: Int) {
        userScenarioBhv.queryDelete {
            it.query().setUserId_Equal(id)
            it.query().setScenarioId_Equal(scenarioId)
        }
    }

    override fun updateUserScenario(sourceScenarioId: Int, destScenarioId: Int) {
        userScenarioBhv.selectList {
            it.query().setScenarioId_Equal(sourceScenarioId)
        }.forEach { userScenario ->
            val userId = userScenario.userId
            deleteUserScenario(userId, sourceScenarioId)
            registerUserScenario(userId, destScenarioId)
        }
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
            },
            introduction = user.introduction
        )
    }
}