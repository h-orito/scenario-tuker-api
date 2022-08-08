package dev.wolfort.scenariotuker.domain.model.user

interface UserRepository {

    fun findAll(): Users

    fun findAllByIds(ids: List<Int>): Users

    fun findAllByRuleBookIds(ruleBookId: Int): Users

    fun search(query: UserQuery, user: User?): Users

    fun findById(id: Int): User?

    fun findByUid(uid: String, includeDeleted: Boolean = false): User?

    fun register(user: User): User

    fun update(user: User): User

    fun delete(userId: Int)

    fun registerUserRuleBook(id: Int, ruleBookId: Int)

    fun deleteUserRuleBook(id: Int, ruleBookId: Int)

    fun updateUserRuleBook(sourceRuleBookId: Int, destRuleBookId: Int)

    fun registerUserScenario(id: Int, scenarioId: Int)

    fun deleteUserScenario(id: Int, scenarioId: Int)

    fun updateUserScenario(sourceScenarioId: Int, destScenarioId: Int)
}