package dev.wolfort.scenariotuker.domain.model.participate

data class Participate(
    val id: Int,
    val scenarioId: Int,
    val userId: Int,
    val roleTypes: List<RoleType>
)
