package dev.wolfort.scenariotuker.domain.model.scenario

data class Scenario(
    val id: Int,
    val name: String,
    val type: ScenarioType,
    val url: String
)