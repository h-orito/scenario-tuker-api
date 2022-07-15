package dev.wolfort.scenariotuker.domain.model.user

interface UserRepository {

    fun findAll(): Users

    fun findAllByIds(ids: List<Int>): Users

    fun search(query: UserQuery): Users

    fun findById(id: Int): User?

    fun findByUid(uid: String): User?

    fun register(user: User): User

    fun update(user: User): User

    fun registerUserRuleBook(id: Int, ruleBookId: Int)

    fun deleteUserRuleBook(id: Int, ruleBookId: Int)

    fun registerUserScenario(id: Int, scenarioId: Int)

    fun deleteUserScenario(id: Int, scenarioId: Int)
}