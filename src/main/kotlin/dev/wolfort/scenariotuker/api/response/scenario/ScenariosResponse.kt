package dev.wolfort.scenariotuker.api.response.scenario

import dev.wolfort.scenariotuker.domain.model.author.Authors
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios

data class ScenariosResponse(val list: List<ScenarioResponse>) {
    constructor(
        scenarios: Scenarios,
        ruleBooks: RuleBooks,
        authors: Authors
    ) : this(
        list = scenarios.list.map { scenario ->
            val ruleBook = ruleBooks.list.find { it.id == scenario.ruleBookId }
            val authorList = authors.list.filter { scenario.authorIds.contains(it.id) }
            ScenarioResponse(
                scenario = scenario,
                ruleBook = ruleBook,
                authors = authorList
            )
        }
    )
}