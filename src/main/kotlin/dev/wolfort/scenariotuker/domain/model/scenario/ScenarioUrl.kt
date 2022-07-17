package dev.wolfort.scenariotuker.domain.model.scenario

import dev.wolfort.scenariotuker.fw.exception.SystemException
import java.util.regex.Matcher
import java.util.regex.Pattern

data class ScenarioUrl(
    val value: String
) {
    private val availableDomains = listOf(
        "booth.pm",
        "talto.cc",
        "www.pixiv.net",
        "character-sheets.appspot.com",
        "twitter.com",
        "www.dlsite.com"
    )

    fun assert() {
        val domain = getUrlDomain() ?: throw SystemException("許可されていないURLです。 url: $value")
        if (availableDomains.none { domain.endsWith(it) }) {
            throw SystemException("許可されていないURLです。 url: $value")
        }
    }

    private fun getUrlDomain(): String? {
        val m: Matcher = Pattern.compile("https?://([^/]+)/").matcher(value)
        return if (m.find()) {
            m.group(1)
        } else {
            null
        }
    }
}