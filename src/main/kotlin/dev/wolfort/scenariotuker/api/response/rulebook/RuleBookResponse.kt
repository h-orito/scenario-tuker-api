package dev.wolfort.scenariotuker.api.response.rulebook

import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystem
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookType

data class RuleBookResponse(
    val id: Int,
    val name: String,
    val dictionaryNames: List<String>,
    val type: RuleBookType,
    val gameSystem: GameSystem
) {
    constructor(ruleBook: RuleBook, gameSystem: GameSystem) : this(
        id = ruleBook.id,
        name = ruleBook.name,
        dictionaryNames = ruleBook.dictionaryNames,
        type = ruleBook.type,
        gameSystem = gameSystem
    )
}