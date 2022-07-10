package dev.wolfort.scenariotuker.api.response.scenario

import dev.wolfort.scenariotuker.domain.model.author.Author
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioType

data class ScenarioResponse(
    val id: Int,
    val name: String,
    val dictionaryNames: List<String>,
    val type: ScenarioType,
    val url: String?,
    val ruleBook: RuleBook?,
    val authors: List<Author>
) {
    constructor(
        scenario: Scenario,
        ruleBook: RuleBook?,
        authors: List<Author>
    ) : this(
        id = scenario.id,
        name = scenario.name,
        dictionaryNames = scenario.dictionaryNames,
        url = scenario.url?.value,
        type = scenario.type,
        ruleBook = ruleBook,
        authors = authors
    )
}