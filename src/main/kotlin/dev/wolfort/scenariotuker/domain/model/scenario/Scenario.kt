package dev.wolfort.scenariotuker.domain.model.scenario

data class Scenario(
    val id: Int,
    val name: String,
    val dictionaryNames: List<String>,
    val type: ScenarioType,
    val url: ScenarioUrl?,
    val gameSystemId: Int?,
    val authorIds: List<Int>
) {
    fun assert() = url?.assert()
}
