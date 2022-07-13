package dev.wolfort.scenariotuker.api.response.participate

import dev.wolfort.scenariotuker.domain.model.author.Authors
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.domain.model.participate.Participates
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import dev.wolfort.scenariotuker.domain.model.user.Users

data class ParticipatesResponse(val list: List<ParticipateResponse>) {

    constructor(
        participates: Participates,
        scenarios: Scenarios,
        gameSystems: GameSystems,
        ruleBooks: RuleBooks,
        authors: Authors,
        users: Users
    ) : this(
        list = participates.list.map { participate ->
            val scenario = scenarios.list.first { it.id == participate.scenarioId }
            val user = users.list.first { it.id == participate.userId }
            val gameSystem = gameSystems.list.find { it.id == scenario.gameSystemId }
            val ruleBookList = ruleBooks.list.filter { participate.ruleBookIds.contains(it.id) }
            val authorList = authors.list.filter { scenario.authorIds.contains(it.id) }
            ParticipateResponse(participate, scenario, gameSystem, ruleBookList, authorList, user)
        }
    )
}