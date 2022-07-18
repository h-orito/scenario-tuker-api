package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystem
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemQuery
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemRepository
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookRepository
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class GameSystemService(
    private val gameSystemRepository: GameSystemRepository,
    private val scenarioRepository: ScenarioRepository,
    private val ruleBookRepository: RuleBookRepository
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

    fun delete(id: Int) {
        deleteCheck(id)
        gameSystemRepository.delete(id)
    }

    fun deleteCheck(gameSystemId: Int) {
        val scenarios = scenarioRepository.findAllByGameSystemId(gameSystemId)
        val ruleBooks = ruleBookRepository.findAllByGameSystemId(gameSystemId)
        if (scenarios.list.isNotEmpty() || ruleBooks.list.isNotEmpty()) {
            throw SystemException("シナリオやルールブックと紐付いたゲームシステムは削除できません")
        }
    }

    fun integrateDelete(sourceId: Int, destId: Int) = gameSystemRepository.integrateDelete(sourceId, destId)
}