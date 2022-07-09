package dev.wolfort.scenariotuker.domain.model.user

import com.fasterxml.jackson.annotation.JsonIgnore

data class TwitterUser(
    @JsonIgnore
    val id: String,
    val screenName: String,
    @JsonIgnore
    val accessToken: String,
    @JsonIgnore
    val tokenSecret: String
)