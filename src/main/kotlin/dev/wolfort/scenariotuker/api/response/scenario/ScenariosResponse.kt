package dev.wolfort.scenariotuker.api.response.scenario

import dev.wolfort.scenariotuker.domain.model.author.Authors
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios

data class ScenariosResponse(val list: List<ScenarioResponse>) {
    constructor(
        scenarios: Scenarios,
        gameSystems: GameSystems,
        authors: Authors
    ) : this(
        list = scenarios.list.map { scenario ->
            val gameSystem = gameSystems.list.find { it.id == scenario.gameSystemId }
            val authorList = authors.list.filter { scenario.authorIds.contains(it.id) }
            ScenarioResponse(
                scenario = scenario,
                gameSystem = gameSystem,
                authors = authorList
            )
        }
    )
}