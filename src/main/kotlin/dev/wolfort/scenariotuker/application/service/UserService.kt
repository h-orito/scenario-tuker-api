package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookRepository
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.domain.model.user.*
import dev.wolfort.scenariotuker.fw.exception.SystemException
import dev.wolfort.scenariotuker.fw.security.Authority
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val ruleBookRepository: RuleBookRepository,
    private val scenarioRepository: ScenarioRepository,
    private val twitterRepository: TwitterRepository
) {

    fun findAll(): Users = userRepository.findAll()

    fun search(query: UserQuery, user: User?): Users = userRepository.search(query, user)

    fun findAllByIds(ids: List<Int>): Users = userRepository.findAllByIds(ids)

    fun findById(userId: Int): User? = userRepository.findById(userId)

    fun findByUid(uid: String): User? = userRepository.findByUid(uid)

    fun register(resource: UserCreateResource): User {
        val user = resource.toUser()
        userRepository.findByUid(resource.uid, true)?.let {
            // twitterのみupdate
            return userRepository.update(user)
        }
        return userRepository.register(user)
    }

    fun update(resource: UserUpdateResource): User {
        val existing =
            userRepository.findByUid(resource.uid) ?: throw SystemException("user not found. uid: ${resource.uid}")
        // 特定項目のみupdate
        return userRepository.update(
            existing.copy(
                name = resource.name,
                introduction = resource.introduction
            )
        )
    }

    fun registerUserRuleBook(userId: Int, ruleBookId: Int) {
        ruleBookRepository.findById(ruleBookId) ?: throw SystemException("rule_book not found. id: $ruleBookId")
        userRepository.registerUserRuleBook(userId, ruleBookId)
    }

    fun deleteUserRuleBook(userId: Int, ruleBookId: Int) {
        userRepository.deleteUserRuleBook(userId, ruleBookId)
    }

    fun updateUserRuleBookId(sourceRuleBookId: Int, destRuleBookId: Int) =
        userRepository.updateUserRuleBook(sourceRuleBookId, destRuleBookId)

    fun registerUserScenario(userId: Int, scenarioId: Int) {
        scenarioRepository.findById(scenarioId) ?: throw SystemException("scenario not found. id: $scenarioId")
        userRepository.registerUserScenario(userId, scenarioId)
    }

    fun deleteUserScenario(userId: Int, scenarioId: Int) {
        userRepository.deleteUserScenario(userId, scenarioId)
    }

    fun updateUserScenarioId(sourceScenarioId: Int, destScenarioId: Int) =
        userRepository.updateUserScenario(sourceScenarioId, destScenarioId)

    fun delete(userId: Int) = userRepository.delete(userId)

    data class UserCreateResource(
        val uid: String,
        val name: String,
        val twitter: Twitter?
    ) {

        data class Twitter(
            val twitterId: String,
            val screenName: String,
            val accessToken: String,
            val tokenSecret: String
        )

        fun toUser(): User = User(
            id = 0,
            uid = uid,
            authority = Authority.User,
            name = name,
            twitter = twitter?.let {
                TwitterUser(
                    id = it.twitterId,
                    screenName = it.screenName,
                    accessToken = it.accessToken,
                    tokenSecret = it.tokenSecret
                )
            },
            introduction = null
        )
    }

    data class UserUpdateResource(
        val uid: String,
        val name: String,
        val introduction: String?
    )
}