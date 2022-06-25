package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.user.User
import dev.wolfort.scenariotuker.domain.model.user.UserQuery
import dev.wolfort.scenariotuker.domain.model.user.UserRepository
import dev.wolfort.scenariotuker.domain.model.user.Users
import dev.wolfort.scenariotuker.fw.exception.SystemException
import dev.wolfort.scenariotuker.fw.security.Authority
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun findAll(): Users = userRepository.findAll()

    fun search(query: UserQuery): Users = userRepository.search(query)

    fun findAllByIds(ids: List<Int>): Users = userRepository.findAllByIds(ids)

    fun findById(userId: Int): User? = userRepository.findById(userId)

    fun findByUid(uid: String): User? = userRepository.findByUid(uid)

    fun register(resource: UserCreateResource): User {
        userRepository.findByUid(resource.uid)?.let {
            // twitter名のみupdate
            return userRepository.update(it.copy(twitterUserName = resource.twitterUserName))
        }
        return userRepository.register(resource.toUser())
    }

    fun update(resource: UserUpdateResource): User {
        val existing =
            userRepository.findByUid(resource.uid) ?: throw SystemException("user not found. uid: ${resource.uid}")
        // nameのみupdate
        return userRepository.update(resource.toUser(existing.twitterUserName))
    }

    fun follow(fromId: Int, toId: Int) = userRepository.follow(fromId, toId)
    fun unfollow(fromId: Int, toId: Int) = userRepository.unfollow(fromId, toId)

    data class UserCreateResource(
        val uid: String,
        val name: String,
        val twitterUserName: String?
    ) {
        fun toUser(): User = User(
            id = 0,
            uid = uid,
            authority = Authority.User,
            name = name,
            twitterUserName = twitterUserName,
            follows = emptyList(),
            followers = emptyList()
        )
    }

    data class UserUpdateResource(
        val uid: String,
        val name: String
    ) {
        fun toUser(twitterUserName: String?): User = User(
            id = 0,
            uid = uid,
            authority = Authority.User,
            name = name,
            twitterUserName = twitterUserName,
            follows = emptyList(),
            followers = emptyList()
        )
    }
}