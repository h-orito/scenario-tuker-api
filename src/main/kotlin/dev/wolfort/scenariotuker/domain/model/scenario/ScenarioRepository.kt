package dev.wolfort.scenariotuker.domain.model.scenario

interface ScenarioRepository {

    fun findAll(): Scenarios

    fun findById(id: Int): Scenario?

    fun register(scenario: Scenario): Scenario

    fun update(scenario: Scenario): Scenario

    fun delete(id: Int)
}