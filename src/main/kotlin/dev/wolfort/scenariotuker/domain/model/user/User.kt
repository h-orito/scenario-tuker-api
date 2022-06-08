package dev.wolfort.scenariotuker.domain.model.user

data class User(
    val id: Int,
    val name: String,
    val twitterUserName: String?
)