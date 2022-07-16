package dev.wolfort.scenariotuker.domain.model.user

data class UserQuery(
    val name: String?,
    val screenName: String?,
    val isTwitterFollowing: Boolean?
)