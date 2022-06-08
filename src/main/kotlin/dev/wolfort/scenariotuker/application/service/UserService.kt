package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.user.User
import dev.wolfort.scenariotuker.domain.model.user.UserRepository
import dev.wolfort.scenariotuker.domain.model.user.Users
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun findAll(): Users = userRepository.findAll()

    fun findById(userId: Int): User? = userRepository.findById(userId)

    fun register(resource: UserCreateResource): User {
        return userRepository.register(resource.toUser())
    }

    fun update(user: User): User = userRepository.update(user)

    data class UserCreateResource(
        val name: String,
        val twitterUserName: String?
    ) {
        fun toUser(): User = User(
            id = 0,
            name = name,
            twitterUserName = twitterUserName
        )
    }
}