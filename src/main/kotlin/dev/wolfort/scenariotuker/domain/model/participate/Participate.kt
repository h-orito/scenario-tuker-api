package dev.wolfort.scenariotuker.domain.model.participate

import dev.wolfort.scenariotuker.domain.model.user.User

data class Participate(
    val id: Int,
    val scenarioId: Int,
    val gameSystemId: Int?,
    val userId: Int,
    val ruleBookIds: List<Int>,
    val roleNames: List<String>,
    val dispOrder: Int,
    val impression: ParticipateImpression?,
    val term: ParticipateTerm? = null,
    val playerNum: Int? = null,
    val gameMaster: String? = null,
    val playerNames: String? = null,
    val requiredHours: Int? = null,
    val memo: String? = null
) {
    fun canViewImpression(
        owner: User,
        myself: User?,
    ): Boolean =
        impression?.canView(owner, myself) ?: false
}
