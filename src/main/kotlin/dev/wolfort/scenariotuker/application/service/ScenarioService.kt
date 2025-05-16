package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.author.AuthorRepository
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemRepository
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateRepository
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioQuery
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioType
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import dev.wolfort.scenariotuker.domain.model.user.UserRepository
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class ScenarioService(
    private val scenarioRepository: ScenarioRepository,
    private val gameSystemRepository: GameSystemRepository,
    private val authorRepository: AuthorRepository,
    private val participateRepository: ParticipateRepository,
    private val userRepository: UserRepository
) {

    fun findAll(): Scenarios = scenarioRepository.findAll()

    fun findAllByIds(ids: List<Int>): Scenarios = scenarioRepository.findAllByIds(ids)

    fun findAllByGameSystemId(gameSystemId: Int): Scenarios = scenarioRepository.findAllByGameSystemId(gameSystemId)

    fun findAllByAuthorId(authorId: Int): Scenarios = scenarioRepository.findAllByAuthorId(authorId)

    fun findAllByUserId(userId: Int): Scenarios = scenarioRepository.findAllByUserId(userId)

    fun findPopularScenarios(type: ScenarioType): Scenarios {
        return scenarioRepository.findPopularScenarios(type, 50)
    }

    fun findAlsoParticipatedScenarios(id: Int): Scenarios {
        val scenario = findById(id) ?: return Scenarios.ofEmpty()
        return scenarioRepository.findAlsoParticipatedScenarios(scenario)
    }

    fun search(query: ScenarioQuery): Scenarios = scenarioRepository.search(query)

    fun findById(id: Int): Scenario? = scenarioRepository.findById(id)

    fun register(scenario: Scenario): Scenario {
        if (gameSystemRepository.findAllByIds(scenario.gameSystemIds).list.size != scenario.gameSystemIds.size) {
            throw SystemException("game_system not found. ids: ${scenario.gameSystemIds}")
        }
        return scenarioRepository.register(scenario)
    }

    fun update(scenario: Scenario): Scenario {
        val existing =
            scenarioRepository.findById(scenario.id) ?: throw SystemException("scenario not found. id: ${scenario.id}")
        val authors = authorRepository.findAllByIds(scenario.authorIds)
        if (scenario.authorIds.size != authors.list.size) {
            throw SystemException("author not found. ids: ${scenario.authorIds}")
        }
        if (!scenario.gameSystemIds.containsAll(existing.gameSystemIds)) {
            throw SystemException("既存のゲームシステムを削除することはできません")
        }
        // 一部項目のみupdate可能
        return scenarioRepository.update(
            scenario.copy(
                type = existing.type,
            )
        )
    }

    fun delete(id: Int) {
        deleteCheck(id)
        scenarioRepository.delete(id)
    }

    fun deleteCheck(id: Int) {
        val scenario = findById(id) ?: return
        val participates = participateRepository.findAllByScenarioId(id)
        val users = userRepository.findAllByRuleBookIds(id)
        if (scenario.authorIds.isNotEmpty() || participates.list.isNotEmpty() || users.list.isNotEmpty()) {
            throw SystemException("製作者や参加記録やユーザーと紐付いたシナリオは削除できません")
        }
    }

    fun updateGameSystemId(sourceGameSystemId: Int, destGameSystemId: Int) =
        scenarioRepository.updateGameSystemId(sourceGameSystemId, destGameSystemId)

    fun integrateDelete(sourceId: Int, destId: Int) = scenarioRepository.integrateDelete(sourceId, destId)
}