package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemRepository
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateRepository
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookQuery
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookRepository
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import dev.wolfort.scenariotuker.domain.model.user.UserRepository
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class RuleBookService(
    private val ruleBookRepository: RuleBookRepository,
    private val gameSystemRepository: GameSystemRepository,
    private val participateRepository: ParticipateRepository,
    private val userRepository: UserRepository
) {
    fun findAll(): RuleBooks = ruleBookRepository.findAll()

    fun findAllByIds(ids: List<Int>): RuleBooks = ruleBookRepository.findAllByIds(ids)

    fun findAllByGameSystemId(gameSystemId: Int): RuleBooks = ruleBookRepository.findAllByGameSystemId(gameSystemId)

    fun findAllByUserId(userId: Int): RuleBooks = ruleBookRepository.findAllByUserId(userId)

    fun findById(id: Int): RuleBook? = ruleBookRepository.findById(id)

    fun search(query: RuleBookQuery): RuleBooks = ruleBookRepository.search(query)

    fun register(ruleBook: RuleBook): RuleBook {
        gameSystemRepository.findById(ruleBook.gameSystemId)
            ?: throw SystemException("game system not found. game_system_id: ${ruleBook.gameSystemId}")
        return ruleBookRepository.register(ruleBook)
    }

    fun update(ruleBook: RuleBook): RuleBook {
        val existing =
            ruleBookRepository.findById(ruleBook.id) ?: throw SystemException("rule_book not found. id: ${ruleBook.id}")
        gameSystemRepository.findById(ruleBook.gameSystemId)
            ?: throw SystemException("game system not found. game_system_id: ${ruleBook.gameSystemId}")
        return ruleBookRepository.update(
            ruleBook.copy(
                gameSystemId = existing.gameSystemId
            )
        )
    }

    fun delete(id: Int) {
        deleteCheck(id)
        ruleBookRepository.delete(id)
    }

    fun deleteCheck(id: Int) {
        val participates = participateRepository.findAllByRuleBookId(id)
        val users = userRepository.findAllByRuleBookIds(id)
        if (participates.list.isNotEmpty() || users.list.isNotEmpty()) {
            throw SystemException("参加記録やユーザーと紐付いたルールブックは削除できません")
        }
    }

    fun updateGameSystemId(sourceGameSystemId: Int, destGameSystemId: Int) =
        ruleBookRepository.updateGameSystemId(sourceGameSystemId, destGameSystemId)

    fun integrateDelete(sourceId: Int, destId: Int) = ruleBookRepository.integrateDelete(sourceId, destId)
}