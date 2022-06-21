package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookQuery
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookRepository
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class RuleBookService(
    private val ruleBookRepository: RuleBookRepository,
    private val scenarioRepository: ScenarioRepository
) {
    fun findAll(): RuleBooks = ruleBookRepository.findAll()

    fun findAllByIds(ids: List<Int>): RuleBooks = ruleBookRepository.findAllByIds(ids)

    fun findById(id: Int): RuleBook? = ruleBookRepository.findById(id)

    fun search(query: RuleBookQuery): RuleBooks = ruleBookRepository.search(query)

    fun register(ruleBook: RuleBook): RuleBook {
        return ruleBookRepository.register(ruleBook)
    }

    fun update(ruleBook: RuleBook): RuleBook {
        return ruleBookRepository.update(ruleBook)
    }

    fun delete(id: Int) {
        val scenarios = scenarioRepository.findByRuleBookId(id)
        if (scenarios.list.isNotEmpty()) throw SystemException("シナリオ登録済みのルールブックは削除できません。 id: $id")
        ruleBookRepository.delete(id)
    }
}