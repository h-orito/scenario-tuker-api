package dev.wolfort.scenariotuker.api.response.scenario

import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioType

data class ScenarioResponse(
    val id: Int,
    val name: String,
    val dictionaryNames: List<String>,
    val type: ScenarioType,
    val ruleBook: RuleBook?,
) {
    constructor(
        scenario: Scenario,
        ruleBook: RuleBook?
    ) : this(
        id = scenario.id,
        name = scenario.name,
        dictionaryNames = scenario.dictionaryNames,
        type = scenario.type,
        ruleBook = ruleBook
    )
}