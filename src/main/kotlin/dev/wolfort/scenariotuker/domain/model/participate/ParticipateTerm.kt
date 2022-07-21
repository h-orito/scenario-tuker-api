package dev.wolfort.scenariotuker.domain.model.participate

import java.time.LocalDate

data class ParticipateTerm(
    val from: LocalDate?,
    val to: LocalDate?
)