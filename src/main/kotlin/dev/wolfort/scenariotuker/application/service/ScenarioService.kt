package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.participate.ParticipateRepository
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioType
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class ScenarioService(
    private val scenarioRepository: ScenarioRepository,
    private val participateRepository: ParticipateRepository
) {

    fun findAll(): Scenarios = scenarioRepository.findAll()

    fun findById(id: Int): Scenario? = scenarioRepository.findById(id)

    fun register(resource: ScenarioCreateResource): Scenario {
        return scenarioRepository.register(resource.toScenario())
    }

    fun update(scenario: Scenario): Scenario = scenarioRepository.update(scenario)

    fun delete(id: Int) {
        val participates = participateRepository.findByScenarioId(id)
        if (participates.list.isNotEmpty()) throw SystemException("参加者がいるシナリオは削除できません。 id: ${id}")
        scenarioRepository.delete(id)
    }

    data class ScenarioCreateResource(
        val name: String,
        val type: ScenarioType,
        val url: String
    ) {
        fun toScenario(): Scenario = Scenario(
            id = 0,
            name = name,
            type = type,
            url = url
        )
    }
}