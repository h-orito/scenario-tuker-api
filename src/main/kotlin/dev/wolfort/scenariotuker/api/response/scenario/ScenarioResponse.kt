package dev.wolfort.scenariotuker.api.response.scenario

import dev.wolfort.scenariotuker.domain.model.author.Author
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystem
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioType

data class ScenarioResponse(
    val id: Int,
    val name: String,
    val dictionaryNames: List<String>,
    val type: ScenarioType,
    val url: String?,
    val gameSystems: List<GameSystem>,
    val authors: List<Author>,
    val gameMasterRequirement: String?,
    val playerNumMin: Int?,
    val playerNumMax: Int?,
    val requiredHours: Int?,
    val participateCount: Long?
) {
    constructor(
        scenario: Scenario,
        gameSystems: List<GameSystem>,
        authors: List<Author>
    ) : this(
        id = scenario.id,
        name = scenario.name,
        dictionaryNames = scenario.dictionaryNames,
        url = scenario.url?.value,
        type = scenario.type,
        gameSystems = scenario.gameSystemIds.map { id -> gameSystems.first { it.id == id } },
        authors = authors,
        gameMasterRequirement = scenario.gameMasterRequirement,
        playerNumMin = scenario.playerNumMin,
        playerNumMax = scenario.playerNumMax,
        requiredHours = scenario.requiredHours,
        participateCount = scenario.participateCount
    )
}