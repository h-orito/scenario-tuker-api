package dev.wolfort.scenariotuker.domain.model.rulebook

interface RuleBookRepository {

    fun findAll(): RuleBooks

    fun findAllByIds(ids: List<Int>): RuleBooks

    fun findById(id: Int): RuleBook?

    fun search(query: RuleBookQuery): RuleBooks

    fun register(ruleBook: RuleBook): RuleBook

    fun update(ruleBook: RuleBook): RuleBook

    fun delete(id: Int)
}