package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.user.*
import dev.wolfort.scenariotuker.fw.exception.SystemException
import dev.wolfort.scenariotuker.fw.security.Authority
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
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
        // nameのみupdate
        return userRepository.update(existing.copy(name = resource.name))
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
            )
        )
    }

    data class UserUpdateResource(
        val uid: String,
        val name: String
    )
}