package dev.wolfort.scenariotuker.domain.model.user

interface TwitterRepository {

    fun getUserIdByUsername(
        accessToken: String,
        tokenSecret: String,
        screenName: String
    ): String?

    fun getFollowings(user: TwitterUser): List<TwitterUser>

    fun getFollowers(user: TwitterUser): List<TwitterUser>
}