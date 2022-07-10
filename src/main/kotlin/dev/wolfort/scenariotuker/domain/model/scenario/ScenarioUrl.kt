package dev.wolfort.scenariotuker.domain.model.scenario

import dev.wolfort.scenariotuker.fw.exception.SystemException

data class ScenarioUrl(
    val value: String
) {
    private val availableDomains = listOf<String>(
        "https://booth.pm/",
        "https://talto.cc/",
        "https://www.pixiv.net/",
        "http://character-sheets.appspot.com/",
        "https://twitter.com/"
    )

    fun assert() {
        if (!availableDomains.contains(value)) {
            throw SystemException("許可されていないURLです。 url: $value")
        }
    }
}