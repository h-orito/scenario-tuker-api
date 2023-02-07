package dev.wolfort.scenariotuker.domain.model.user

interface TwitterRepository {

    fun getFollowings(user: TwitterUser): List<TwitterUser>

    fun getFollowers(user: TwitterUser): List<TwitterUser>
}