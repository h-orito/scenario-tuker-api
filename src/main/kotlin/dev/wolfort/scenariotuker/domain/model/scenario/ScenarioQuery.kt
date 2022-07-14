package dev.wolfort.scenariotuker.domain.model.scenario

data class ScenarioQuery(
    val name: String?,
    val gameSystemId: Int?,
    val gameSystemName: String?,
    val type: ScenarioType,
    val authorName: String?
) {
    fun isEmpty() = name.isNullOrBlank()
            && gameSystemId == null
            && gameSystemName.isNullOrBlank()
            && authorName.isNullOrBlank()
}