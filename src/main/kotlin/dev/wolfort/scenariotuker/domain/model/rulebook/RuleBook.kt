package dev.wolfort.scenariotuker.domain.model.rulebook

data class RuleBook(
    val id: Int,
    val name: String,
    val dictionaryNames: List<String>,
    val type: RuleBookType,
    val gameSystemId: Int
)