package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbUserBhv
import dev.wolfort.dbflute.exentity.DbUser
import dev.wolfort.scenariotuker.domain.model.user.User
import dev.wolfort.scenariotuker.domain.model.user.UserRepository
import dev.wolfort.scenariotuker.domain.model.user.Users
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val userBhv: DbUserBhv
) : UserRepository {

    override fun findAll(): Users {
        val dbUserList = userBhv.selectList {
            it.query().addOrderBy_UserId_Asc()
        }
        return mappingToUsers(dbUserList)
    }

    override fun findById(id: Int): User? {
        val optDbUser = userBhv.selectEntity {
            it.query().setUserId_Equal(id)
        }
        return optDbUser.map { mappingToUser(it) }.orElse(null)
    }

    override fun register(user: User): User {
        val u = DbUser()
        u.userName = user.name
        u.twitterUserName = user.twitterUserName
        userBhv.insert(u)
        return findById(u.userId)!!
    }

    override fun update(user: User): User {
        findById(user.id) ?: throw SystemException("user not found. id: ${user.id}")

        val u = DbUser()
        u.userId = user.id
        u.userName = user.name
        u.twitterUserName = user.twitterUserName
        userBhv.update(u)
        return findById(user.id)!!
    }

    private fun mappingToUsers(list: List<DbUser>): Users {
        return Users(list = list.map { mappingToUser(it) })
    }

    private fun mappingToUser(user: DbUser): User {
        return User(
            id = user.userId,
            name = user.userName,
            twitterUserName = user.twitterUserName
        )
    }
}