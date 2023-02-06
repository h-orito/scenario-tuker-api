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
    // API有料化により機能停止
    val twitter: TwitterUser?,
    val introduction: String?
)