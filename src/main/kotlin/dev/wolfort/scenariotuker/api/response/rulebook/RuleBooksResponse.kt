package dev.wolfort.scenariotuker.api.response.rulebook

import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks

data class RuleBooksResponse(val list: List<RuleBookResponse>) {

    constructor(ruleBooks: RuleBooks, gameSystems: GameSystems) : this(
        list = ruleBooks.list.map { ruleBook ->
            val gameSystem = gameSystems.list.first { it.id == ruleBook.gameSystemId }
            RuleBookResponse(ruleBook, gameSystem)
        }
    )
}