package dev.wolfort.scenariotuker.domain.model.scenario

interface ScenarioRepository {

    fun findAll(): Scenarios

    fun findAllByIds(ids: List<Int>): Scenarios

    fun findAllByGameSystemId(gameSystemId: Int): Scenarios

    fun findAllByAuthorId(authorId: Int): Scenarios

    fun findAllByUserId(userId: Int): Scenarios

    fun search(query: ScenarioQuery): Scenarios

    fun findById(id: Int): Scenario?

    fun register(scenario: Scenario): Scenario

    fun update(scenario: Scenario): Scenario

    fun delete(id: Int)

    fun updateGameSystemId(sourceGameSystemId: Int, destGameSystemId: Int)

    fun integrateDelete(sourceId: Int, destId: Int)
}