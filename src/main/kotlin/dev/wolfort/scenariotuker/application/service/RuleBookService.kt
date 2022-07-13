package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemRepository
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookQuery
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookRepository
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class RuleBookService(
    private val ruleBookRepository: RuleBookRepository,
    private val gameSystemRepository: GameSystemRepository
) {
    fun findAll(): RuleBooks = ruleBookRepository.findAll()

    fun findAllByIds(ids: List<Int>): RuleBooks = ruleBookRepository.findAllByIds(ids)

    fun findAllByGameSystemId(gameSystemId: Int): RuleBooks = ruleBookRepository.findAllByGameSystemId(gameSystemId)

    fun findById(id: Int): RuleBook? = ruleBookRepository.findById(id)

    fun search(query: RuleBookQuery): RuleBooks = ruleBookRepository.search(query)

    fun register(ruleBook: RuleBook): RuleBook {
        gameSystemRepository.findById(ruleBook.gameSystemId)
            ?: throw SystemException("game system not found. game_system_id: ${ruleBook.gameSystemId}")
        return ruleBookRepository.register(ruleBook)
    }

    fun update(ruleBook: RuleBook): RuleBook {
        gameSystemRepository.findById(ruleBook.gameSystemId)
            ?: throw SystemException("game system not found. game_system_id: ${ruleBook.gameSystemId}")
        return ruleBookRepository.update(ruleBook)
    }
}