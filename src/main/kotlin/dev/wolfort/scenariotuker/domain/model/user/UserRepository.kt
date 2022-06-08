package dev.wolfort.scenariotuker.domain.model.user

interface UserRepository {

    fun findAll(): Users

    fun findById(id: Int): User?

    fun register(user: User): User

    fun update(user: User): User
}