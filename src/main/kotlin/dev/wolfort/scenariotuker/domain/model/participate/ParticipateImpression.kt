package dev.wolfort.scenariotuker.domain.model.participate

import dev.wolfort.scenariotuker.domain.model.user.TwitterUser
import dev.wolfort.scenariotuker.domain.model.user.User

data class ParticipateImpression(
    val hasSpoiler: Boolean,
    val disclosureRange: DisclosureRange,
    val content: String
) {
    fun canView(
        owner: User,
        myself: User?,
        followings: List<TwitterUser>,
        followers: List<TwitterUser>
    ): Boolean {
        // 自分は常に見られる
        if (owner.id == myself?.id) return true
        if (disclosureRange == DisclosureRange.Everyone) return true
        myself ?: return false

        // API有料化に伴い機能停止
        return false
//        return when (disclosureRange) {
//            DisclosureRange.Follower -> {
//                followings.any { following -> following.id == owner.twitter.id }
//            }
//            DisclosureRange.EachFollow -> {
//                val isUserFollowedByMyself = followings.any { following -> following.id == owner.twitter.id }
//                val isUserFollowingToMyself = followers.any { follower -> follower.id == owner.twitter.id }
//                isUserFollowedByMyself && isUserFollowingToMyself
//            }
//            else -> false
//        }
    }
}