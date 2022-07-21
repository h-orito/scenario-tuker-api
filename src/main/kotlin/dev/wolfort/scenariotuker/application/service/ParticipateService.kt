package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.participate.Participate
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateRepository
import dev.wolfort.scenariotuker.domain.model.participate.Participates
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.domain.model.user.UserRepository
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class ParticipateService(
    private val participateRepository: ParticipateRepository,
    private val scenarioRepository: ScenarioRepository,
    private val userRepository: UserRepository
) {

    fun findAll(): Participates = participateRepository.findAll()

    fun findAllByUserId(userId: Int): Participates = participateRepository.findAllByUserId(userId)

    fun findAllByScenarioId(scenarioId: Int): Participates = participateRepository.findAllByScenarioId(scenarioId)

    fun findAllByRuleBookId(ruleBookId: Int): Participates = participateRepository.findAllByRuleBookId(ruleBookId)

    fun findById(id: Int): Participate? = participateRepository.findById(id)

    fun register(participate: Participate): Participate {
        val existing = findAllByUserId(participate.userId)
        // 既に通過済みの場合はロールを追加する
        existing.list.find { it.scenarioId == participate.scenarioId }?.let { existingParticipate ->
            return participateRepository.update(
                participate.copy(
                    id = existingParticipate.id,
                    scenarioId = existingParticipate.scenarioId,
                    userId = existingParticipate.userId,
                    ruleBookIds = existingParticipate.ruleBookIds,
                    dispOrder = existingParticipate.dispOrder
                )
            )
        }
        // 存在しない場合は新規登録
        return participateRepository.register(participate)
    }

    fun update(participate: Participate): Participate {
        findById(participate.id) ?: throw SystemException("participate not found. id: ${participate.id}")
        scenarioRepository.findById(participate.scenarioId)
            ?: throw SystemException("scenario not found. id: ${participate.scenarioId}")
        userRepository.findById(participate.userId)
            ?: throw SystemException("user not found. id: ${participate.userId}")

        return participateRepository.update(participate)
    }

    fun delete(id: Int) = participateRepository.delete(id)

    fun updateRuleBookId(sourceRuleBookId: Int, destRuleBookId: Int) =
        participateRepository.updateRuleBookId(sourceRuleBookId, destRuleBookId)

    fun updateScenarioId(sourceScenarioId: Int, destScenarioId: Int) =
        participateRepository.updateScenarioId(sourceScenarioId, destScenarioId)
}