package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.participate.ParticipateRepository
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookRepository
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioQuery
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class ScenarioService(
    private val scenarioRepository: ScenarioRepository,
    private val participateRepository: ParticipateRepository,
    private val ruleBookRepository: RuleBookRepository
) {

    fun findAll(): Scenarios = scenarioRepository.findAll()

    fun findAllByIds(ids: List<Int>): Scenarios = scenarioRepository.findAllByIds(ids)

    fun search(query: ScenarioQuery): Scenarios = scenarioRepository.search(query)

    fun findById(id: Int): Scenario? = scenarioRepository.findById(id)

    fun register(scenario: Scenario): Scenario {
        scenario.ruleBookId?.let {
            ruleBookRepository.findById(it) ?: throw SystemException("rule_book not found. id: $it")
        }
        return scenarioRepository.register(scenario)
    }

    fun update(scenario: Scenario): Scenario {
        scenario.ruleBookId?.let {
            ruleBookRepository.findById(it) ?: throw SystemException("rule_book not found. id: $it")
        }
        return scenarioRepository.update(scenario)
    }

    fun delete(id: Int) {
        val participates = participateRepository.findByScenarioId(id)
        if (participates.list.isNotEmpty()) throw SystemException("参加者がいるシナリオは削除できません。 id: ${id}")
        scenarioRepository.delete(id)
    }
}