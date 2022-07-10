package dev.wolfort.scenariotuker.api.response.participate

import dev.wolfort.scenariotuker.api.response.scenario.ScenarioResponse
import dev.wolfort.scenariotuker.domain.model.author.Author
import dev.wolfort.scenariotuker.domain.model.participate.Participate
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateImpression
import dev.wolfort.scenariotuker.domain.model.participate.RoleType
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.user.User

data class ParticipateResponse(
    val id: Int,
    val scenario: ScenarioResponse,
    val user: User,
    val roleTypes: List<RoleType>,
    val dispOrder: Int,
    val impression: ParticipateImpression?
) {
    constructor(
        participate: Participate,
        scenario: Scenario,
        ruleBook: RuleBook?,
        authors: List<Author>,
        user: User
    ) : this(
        id = participate.id,
        scenario = ScenarioResponse(scenario, ruleBook, authors),
        user = user,
        roleTypes = participate.roleTypes,
        dispOrder = participate.dispOrder,
        impression = participate.impression
    )
}