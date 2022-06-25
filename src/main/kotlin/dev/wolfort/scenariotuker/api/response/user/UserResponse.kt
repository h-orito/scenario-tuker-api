package dev.wolfort.scenariotuker.api.response.user

import dev.wolfort.scenariotuker.domain.model.user.User
import dev.wolfort.scenariotuker.domain.model.user.Users

data class UserResponse(
    val id: Int,
    val name: String,
    val twitterUserName: String?,
    val follows: List<User>,
    val followers: List<User>
) {
    constructor(
        user: User,
        users: Users
    ) : this(
        id = user.id,
        name = user.name,
        twitterUserName = user.twitterUserName,
        follows = user.follows.map { followUserId -> users.list.first { it.id == followUserId } },
        followers = user.followers.map { followerUserId -> users.list.first { it.id == followerUserId } },
    )
}