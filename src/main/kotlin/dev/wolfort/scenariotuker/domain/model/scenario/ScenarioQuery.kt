package dev.wolfort.scenariotuker.domain.model.scenario

data class ScenarioQuery(
    val name: String?,
    val ruleBookId: Int?,
    val type: ScenarioType
)