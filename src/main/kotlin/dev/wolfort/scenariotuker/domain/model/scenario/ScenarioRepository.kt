package dev.wolfort.scenariotuker.domain.model.scenario

interface ScenarioRepository {

    fun findAll(): Scenarios

    fun findAllByIds(ids: List<Int>): Scenarios

    fun search(query: ScenarioQuery): Scenarios

    fun findByRuleBookId(ruleBookId: Int): Scenarios

    fun findByAuthorId(authorId: Int): Scenarios

    fun findById(id: Int): Scenario?

    fun register(scenario: Scenario): Scenario

    fun update(scenario: Scenario): Scenario
}