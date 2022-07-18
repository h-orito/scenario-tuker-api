package dev.wolfort.scenariotuker.domain.model.gamesystem

interface GameSystemRepository {

    fun findAll(): GameSystems

    fun findAllByIds(ids: List<Int>): GameSystems

    fun search(query: GameSystemQuery): GameSystems

    fun findById(id: Int): GameSystem?

    fun register(gameSystem: GameSystem): GameSystem

    fun update(gameSystem: GameSystem): GameSystem

    fun delete(id: Int)

    fun integrateDelete(sourceId: Int, destId: Int)
}