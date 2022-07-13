package dev.wolfort.scenariotuker.domain.model.rulebook

data class RuleBookQuery(
    val name: String?,
    val gameSystemId: Int?,
    val ruleBookType: RuleBookType?
) {
    fun isEmpty(): Boolean = name.isNullOrEmpty() && gameSystemId == null && ruleBookType == null
}