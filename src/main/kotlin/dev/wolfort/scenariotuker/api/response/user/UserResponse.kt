package dev.wolfort.scenariotuker.api.response.user

import dev.wolfort.scenariotuker.domain.model.user.TwitterUser
import dev.wolfort.scenariotuker.domain.model.user.User

data class UserResponse(
    val id: Int,
    val name: String,
    val twitter: TwitterUser
) {
    constructor(
        user: User
    ) : this(
        id = user.id,
        name = user.name,
        twitter = user.twitter
    )
}