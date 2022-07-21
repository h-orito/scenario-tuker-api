package dev.wolfort.scenariotuker.api.response.participate

import dev.wolfort.scenariotuker.api.response.scenario.ScenarioResponse
import dev.wolfort.scenariotuker.domain.model.author.Author
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystem
import dev.wolfort.scenariotuker.domain.model.participate.Participate
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateImpression
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateTerm
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.user.User

data class ParticipateResponse(
    val id: Int,
    val scenario: ScenarioResponse,
    val user: User,
    val ruleBooks: List<RuleBook>,
    val roleNames: List<String>,
    val dispOrder: Int,
    val impression: ParticipateImpression?,
    val term: ParticipateTerm?,
    val playerNum: Int?,
    val gameMaster: String?,
    val playerNames: String?,
    val requiredHours: Int?,
    val memo: String?
) {
    constructor(
        participate: Participate,
        scenario: Scenario,
        gameSystem: GameSystem?,
        ruleBooks: List<RuleBook>,
        authors: List<Author>,
        user: User
    ) : this(
        id = participate.id,
        scenario = ScenarioResponse(scenario, gameSystem, authors),
        user = user,
        ruleBooks = ruleBooks,
        roleNames = participate.roleNames,
        dispOrder = participate.dispOrder,
        impression = participate.impression,
        term = participate.term,
        playerNum = participate.playerNum,
        gameMaster = participate.gameMaster,
        playerNames = participate.playerNames,
        requiredHours = participate.requiredHours,
        memo = participate.memo
    )
}