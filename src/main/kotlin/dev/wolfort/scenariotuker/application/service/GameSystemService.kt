package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystem
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemQuery
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemRepository
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import org.springframework.stereotype.Service

@Service
class GameSystemService(
    private val gameSystemRepository: GameSystemRepository,
) {
    fun findAll(): GameSystems = gameSystemRepository.findAll()

    fun findAllByIds(ids: List<Int>): GameSystems = gameSystemRepository.findAllByIds(ids)

    fun search(query: GameSystemQuery): GameSystems = gameSystemRepository.search(query)

    fun findById(id: Int): GameSystem? = gameSystemRepository.findById(id)

    fun register(gameSystem: GameSystem): GameSystem {
        return gameSystemRepository.register(gameSystem)
    }

    fun update(gameSystem: GameSystem): GameSystem {
        return gameSystemRepository.update(gameSystem)
    }
}