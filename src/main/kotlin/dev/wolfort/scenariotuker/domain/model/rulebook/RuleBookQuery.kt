package dev.wolfort.scenariotuker.domain.model.rulebook

data class RuleBookQuery(
    val name: String?,
    val gameSystemId: Int?,
    val gameSystemName: String?,
    val ruleBookType: RuleBookType?
) {
    fun isEmpty(): Boolean = name.isNullOrEmpty()
            && gameSystemId == null
            && gameSystemName.isNullOrEmpty()
            && ruleBookType == null
}