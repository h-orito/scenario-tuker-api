package dev.wolfort.scenariotuker.domain.model.scenario

import dev.wolfort.scenariotuker.domain.model.paging.PagingQuery

data class ScenarioQuery(
    val name: String?,
    val gameSystemId: Int?,
    val gameSystemName: String?,
    val type: ScenarioType?,
    val authorName: String?,
    val playerNum: Int?,
    val playerNumEmpty: Boolean?,
    val paging: PagingQuery?
) {
    fun isEmpty() = name.isNullOrBlank()
            && gameSystemId == null
            && gameSystemName.isNullOrBlank()
            && type == null
            && authorName.isNullOrBlank()
            && playerNum == null
            && playerNumEmpty == null
            && paging == null
}