package dev.wolfort.scenariotuker.api.response.participate

import dev.wolfort.scenariotuker.domain.model.participate.Participates
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import dev.wolfort.scenariotuker.domain.model.user.Users

data class ParticipatesResponse(val list: List<ParticipateResponse>) {

    constructor(
        participates: Participates,
        scenarios: Scenarios,
        ruleBooks: RuleBooks,
        users: Users
    ) : this(
        list = participates.list.map { participate ->
            val scenario = scenarios.list.first { it.id == participate.scenarioId }
            val user = users.list.first { it.id == participate.userId }
            val ruleBook = scenario.ruleBookId?.let { ruleBookId -> ruleBooks.list.find { it.id == ruleBookId } }
            ParticipateResponse(participate, scenario, ruleBook, user)
        }
    )
}