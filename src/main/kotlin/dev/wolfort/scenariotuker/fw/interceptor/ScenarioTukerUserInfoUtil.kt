package dev.wolfort.scenariotuker.fw.interceptor

import dev.wolfort.scenariotuker.fw.security.ScenarioTukerUser
import org.springframework.security.core.context.SecurityContextHolder


class ScenarioTukerUserInfoUtil private constructor() {
    companion object {
        fun getUserInfo(): ScenarioTukerUser? {
            val authentication = SecurityContextHolder.getContext().authentication ?: return null
            return if (authentication.principal is ScenarioTukerUser) {
                ScenarioTukerUser::class.java.cast(authentication.principal)
            } else null
        }
    }
}