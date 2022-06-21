package dev.wolfort.scenariotuker.api.response.participate

import dev.wolfort.scenariotuker.api.response.scenario.ScenarioResponse
import dev.wolfort.scenariotuker.domain.model.participate.Participate
import dev.wolfort.scenariotuker.domain.model.participate.RoleType
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.user.User

data class ParticipateResponse(
    val id: Int,
    val scenario: ScenarioResponse,
    val user: User,
    val roleTypes: List<RoleType>
) {
    constructor(
        participate: Participate,
        scenario: Scenario,
        ruleBook: RuleBook?,
        user: User
    ) : this(
        id = participate.id,
        scenario = ScenarioResponse(scenario, ruleBook),
        user = user,
        roleTypes = participate.roleTypes
    )
}