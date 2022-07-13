package dev.wolfort.scenariotuker.domain.model.participate

import dev.wolfort.scenariotuker.domain.model.user.TwitterUser
import dev.wolfort.scenariotuker.domain.model.user.User

data class Participate(
    val id: Int,
    val scenarioId: Int,
    val userId: Int,
    val ruleBookIds: List<Int>,
    val roleTypes: List<RoleType>,
    val dispOrder: Int,
    val impression: ParticipateImpression?
) {
    fun canViewImpression(
        owner: User,
        myself: User?,
        followings: List<TwitterUser>,
        followers: List<TwitterUser>
    ): Boolean =
        impression?.canView(owner, myself, followings, followers) ?: false
}
