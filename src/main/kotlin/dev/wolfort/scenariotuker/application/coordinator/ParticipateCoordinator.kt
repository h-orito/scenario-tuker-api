package dev.wolfort.scenariotuker.application.coordinator

import dev.wolfort.scenariotuker.application.service.ParticipateService
import dev.wolfort.scenariotuker.application.service.UserService
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateImpression
import dev.wolfort.scenariotuker.domain.model.user.TwitterRepository
import dev.wolfort.scenariotuker.domain.model.user.User
import org.springframework.stereotype.Service

@Service
class ParticipateCoordinator(
    private val participateService: ParticipateService,
    private val userService: UserService,
    private val twitterRepository: TwitterRepository
) {
    fun getImpressionIfAllowed(participateId: Int, myself: User?): ParticipateImpression? {
        val participate = participateService.findById(participateId) ?: return null
        participate.impression ?: return null
        val user = userService.findById(participate.userId)!!
        val followings = myself?.let { twitterRepository.getFollowings(it.twitter) } ?: emptyList()
        val followers = myself?.let { twitterRepository.getFollowers(it.twitter) } ?: emptyList()
        return if (participate.canViewImpression(user, myself, followings, followers)) participate.impression
        else null
    }
}