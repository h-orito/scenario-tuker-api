package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.application.service.RuleBookService
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookQuery
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rule-books")
class RuleBookController(
    private val ruleBookService: RuleBookService
) {
    @GetMapping
    private fun list(): RuleBooks = ruleBookService.findAll()

    @GetMapping("/{ruleBookId}")
    private fun get(@PathVariable ruleBookId: Int): RuleBook? = ruleBookService.findById(ruleBookId)

    @GetMapping("/search")
    private fun search(request: SearchRequest): RuleBooks = ruleBookService.search(request.toQuery())

    data class SearchRequest(
        var name: String = ""
    ) {
        fun toQuery() = RuleBookQuery(name = name)
    }

    @PostMapping
    private fun post(@RequestBody @Validated request: PostRequest): RuleBook =
        ruleBookService.register(request.toRuleBook())

    @PutMapping
    private fun put(@RequestBody @Validated request: PostRequest): RuleBook =
        ruleBookService.update(request.toRuleBook())

    data class PostRequest(
        val id: Int? = null,
        val name: String = "",
        val dictionaryNames: List<String> = emptyList()
    ) {
        fun toRuleBook() = RuleBook(
            id = id ?: 0,
            name = name,
            dictionaryNames = dictionaryNames
        )
    }

    @DeleteMapping("/{ruleBookId}")
    private fun delete(@PathVariable ruleBookId: Int) = ruleBookService.delete(ruleBookId)
}