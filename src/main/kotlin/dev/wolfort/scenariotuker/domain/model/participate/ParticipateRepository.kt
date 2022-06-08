package dev.wolfort.scenariotuker.domain.model.participate

interface ParticipateRepository {

    fun findAll(): Participates

    fun findById(id: Int): Participate?

    fun findByScenarioId(scenarioId: Int): Participates

    fun findByUserId(userId: Int): Participates

    fun register(participate: Participate): Participate

    fun update(participate: Participate): Participate

    fun delete(id: Int)
}