package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.author.AuthorRepository
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemRepository
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioQuery
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class ScenarioService(
    private val scenarioRepository: ScenarioRepository,
    private val gameSystemRepository: GameSystemRepository,
    private val authorRepository: AuthorRepository
) {

    fun findAll(): Scenarios = scenarioRepository.findAll()

    fun findAllByIds(ids: List<Int>): Scenarios = scenarioRepository.findAllByIds(ids)

    fun findAllByGameSystemId(gameSystemId: Int): Scenarios = scenarioRepository.findAllByGameSystemId(gameSystemId)

    fun findAllByAuthorId(authorId: Int): Scenarios = scenarioRepository.findAllByAuthorId(authorId)

    fun findAllByUserId(userId: Int): Scenarios = scenarioRepository.findAllByUserId(userId)

    fun search(query: ScenarioQuery): Scenarios = scenarioRepository.search(query)

    fun findById(id: Int): Scenario? = scenarioRepository.findById(id)

    fun register(scenario: Scenario): Scenario {
        scenario.gameSystemId?.let {
            gameSystemRepository.findById(it) ?: throw SystemException("game_system not found. id: $it")
        }
        return scenarioRepository.register(scenario)
    }

    fun update(scenario: Scenario): Scenario {
        scenario.gameSystemId?.let {
            gameSystemRepository.findById(it) ?: throw SystemException("game_system not found. id: $it")
        }
        val authors = authorRepository.findAllByIds(scenario.authorIds)
        if (scenario.authorIds.size != authors.list.size) {
            throw SystemException("author not found. ids: ${scenario.authorIds}")
        }
        return scenarioRepository.update(scenario)
    }
}