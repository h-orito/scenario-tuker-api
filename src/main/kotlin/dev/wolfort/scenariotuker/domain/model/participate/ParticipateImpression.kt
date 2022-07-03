package dev.wolfort.scenariotuker.domain.model.participate

import dev.wolfort.scenariotuker.domain.model.user.User

data class ParticipateImpression(
    val hasSpoiler: Boolean,
    val disclosureRange: DisclosureRange,
    val content: String
) {
    fun canView(owner: User, myself: User?): Boolean {
        // 自分は常に見られる
        if (owner.id == myself?.id) return true
        if (disclosureRange == DisclosureRange.Everyone) return true
        myself ?: return false

        return when (disclosureRange) {
            DisclosureRange.Follower -> owner.isFollowedBy(myself)
            DisclosureRange.EachFollow -> owner.isFollowing(myself) && owner.isFollowedBy(myself)
            else -> false
        }
    }
}