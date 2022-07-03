package dev.wolfort.scenariotuker.domain.model.user

import com.fasterxml.jackson.annotation.JsonIgnore
import dev.wolfort.scenariotuker.fw.security.Authority

data class User(
    val id: Int,
    @JsonIgnore
    val uid: String,
    @JsonIgnore
    val authority: Authority,
    val name: String,
    val twitterUserName: String?,
    val follows: List<Int>,
    val followers: List<Int>
) {
    fun isFollowing(user: User): Boolean = follows.contains(user.id)
    fun isFollowedBy(user: User): Boolean = followers.contains(user.id)
}