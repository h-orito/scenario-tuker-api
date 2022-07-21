package dev.wolfort.scenariotuker.domain.model.participate

import dev.wolfort.scenariotuker.domain.model.user.TwitterUser
import dev.wolfort.scenariotuker.domain.model.user.User

data class Participate(
    val id: Int,
    val scenarioId: Int,
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
        followings: List<TwitterUser>,
        followers: List<TwitterUser>
    ): Boolean =
        impression?.canView(owner, myself, followings, followers) ?: false
}
