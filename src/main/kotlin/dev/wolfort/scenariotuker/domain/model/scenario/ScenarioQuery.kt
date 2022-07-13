package dev.wolfort.scenariotuker.domain.model.scenario

data class ScenarioQuery(
    val name: String?,
    val gameSystemId: Int?,
    val type: ScenarioType
)