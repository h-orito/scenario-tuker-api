package dev.wolfort.scenariotuker.api.response.scenario

import dev.wolfort.scenariotuker.domain.model.author.Authors
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios

data class ScenariosResponse(
    val list: List<ScenarioResponse>,
    val allRecordCount: Int,
    val allPageCount: Int,
    val existPrePage: Boolean,
    val existNextPage: Boolean,
    val currentPageNum: Int
) {
    constructor(
        scenarios: Scenarios,
        gameSystems: GameSystems,
        authors: Authors
    ) : this(
        list = scenarios.list.map { scenario ->
            val scenarioGameSystems =
                scenarios.list.flatMap { it.gameSystemIds }.distinct().map { scenarioGameSystemId ->
                    gameSystems.list.first { it.id == scenarioGameSystemId }
                }
            val authorList = authors.list.filter { scenario.authorIds.contains(it.id) }
            ScenarioResponse(
                scenario = scenario,
                gameSystems = scenarioGameSystems,
                authors = authorList
            )
        },
        allRecordCount = scenarios.allRecordCount,
        allPageCount = scenarios.allPageCount,
        existPrePage = scenarios.existPrePage,
        existNextPage = scenarios.existNextPage,
        currentPageNum = scenarios.currentPageNum
    )

    companion object {
        fun ofEmpty() = ScenariosResponse(
            list = emptyList(),
            allRecordCount = 0,
            allPageCount = 0,
            existPrePage = false,
            existNextPage = false,
            currentPageNum = 0
        )
    }
}