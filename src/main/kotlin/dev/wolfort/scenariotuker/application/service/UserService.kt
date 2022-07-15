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

    fun search(query: UserQuery): Users = userRepository.search(query)

    fun findAllByIds(ids: List<Int>): Users = userRepository.findAllByIds(ids)

    fun findById(userId: Int): User? = userRepository.findById(userId)

    fun findByUid(uid: String): User? = userRepository.findByUid(uid)

    fun register(resource: UserCreateResource): User {
        val twitterUserId = twitterRepository.getUserIdByUsername(
            accessToken = resource.accessToken,
            tokenSecret = resource.tokenSecret,
            screenName = resource.screenName
        ) ?: throw SystemException("failed to get twitter user id. screenName: ${resource.screenName}")

        val user = resource.toUser(twitterUserId)
        userRepository.findByUid(resource.uid)?.let {
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

    fun registerUserScenario(userId: Int, scenarioId: Int) {
        scenarioRepository.findById(scenarioId) ?: throw SystemException("scenario not found. id: $scenarioId")
        userRepository.registerUserScenario(userId, scenarioId)
    }

    fun deleteUserScenario(userId: Int, scenarioId: Int) {
        userRepository.deleteUserScenario(userId, scenarioId)
    }

    data class UserCreateResource(
        val uid: String,
        val name: String,
        val screenName: String,
        val accessToken: String,
        val tokenSecret: String
    ) {
        fun toUser(twitterUserId: String): User = User(
            id = 0,
            uid = uid,
            authority = Authority.User,
            name = name,
            twitter = TwitterUser(
                id = twitterUserId,
                screenName = screenName,
                accessToken = accessToken,
                tokenSecret = tokenSecret
            ),
            introduction = null
        )
    }

    data class UserUpdateResource(
        val uid: String,
        val name: String,
        val introduction: String?
    )
}