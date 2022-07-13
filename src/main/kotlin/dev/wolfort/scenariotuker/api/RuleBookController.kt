package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.participate.ParticipatesResponse
import dev.wolfort.scenariotuker.api.response.rulebook.RuleBookResponse
import dev.wolfort.scenariotuker.api.response.rulebook.RuleBooksResponse
import dev.wolfort.scenariotuker.application.service.*
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookQuery
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookType
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rule-books")
class RuleBookController(
    private val ruleBookService: RuleBookService,
    private val gameSystemService: GameSystemService,
    private val participateService: ParticipateService,
    private val userService: UserService,
    private val authorService: AuthorService,
    private val scenarioService: ScenarioService
) {
    @GetMapping
    private fun list(): RuleBooksResponse {
        val ruleBooks = ruleBookService.findAll()
        val gameSystems = gameSystemService.findAllByIds(ruleBooks.list.map { it.gameSystemId }.distinct())
        return RuleBooksResponse(ruleBooks, gameSystems)
    }

    @GetMapping("/{ruleBookId}")
    private fun get(@PathVariable ruleBookId: Int): RuleBookResponse? {
        val ruleBook = ruleBookService.findById(ruleBookId) ?: return null
        val gameSystem = gameSystemService.findById(ruleBook.gameSystemId)!!
        return RuleBookResponse(ruleBook, gameSystem)
    }

    @GetMapping("/search")
    private fun search(request: SearchRequest): RuleBooksResponse {
        val ruleBooks = ruleBookService.search(request.toQuery())
        val gameSystems = gameSystemService.findAllByIds(ruleBooks.list.map { it.gameSystemId }.distinct())
        return RuleBooksResponse(ruleBooks, gameSystems)
    }

    data class SearchRequest(
        var name: String? = null,
        val game_system_id: Int? = null,
        val rule_book_type: RuleBookType? = null
    ) {
        fun toQuery() = RuleBookQuery(name = name, gameSystemId = game_system_id, ruleBookType = rule_book_type)
    }

    @PostMapping
    private fun post(@RequestBody @Validated request: PostRequest): RuleBookResponse {
        val ruleBook = ruleBookService.register(request.toRuleBook())
        val gameSystem = gameSystemService.findById(ruleBook.gameSystemId)!!
        return RuleBookResponse(ruleBook, gameSystem)
    }

    @PutMapping
    private fun put(@RequestBody @Validated request: PostRequest): RuleBookResponse {
        val ruleBook = ruleBookService.update(request.toRuleBook())
        val gameSystem = gameSystemService.findById(ruleBook.gameSystemId)!!
        return RuleBookResponse(ruleBook, gameSystem)
    }

    data class PostRequest(
        val id: Int? = null,
        val name: String = "",
        val type: RuleBookType = RuleBookType.Base,
        val dictionaryNames: List<String> = emptyList(),
        val gameSystemId: Int = 0
    ) {
        fun toRuleBook() = RuleBook(
            id = id ?: 0,
            name = name,
            dictionaryNames = dictionaryNames,
            type = type,
            gameSystemId = gameSystemId
        )
    }

    @GetMapping("/{ruleBookId}/participates")
    private fun ruleBookParticipates(@PathVariable ruleBookId: Int): ParticipatesResponse {
        val ruleBook =
            ruleBookService.findById(ruleBookId) ?: throw SystemException("rule_book not found. id: $ruleBookId")
        var participates = participateService.findAllByRuleBookId(ruleBookId)
        val scenarios = scenarioService.findAllByIds(participates.list.map { it.scenarioId }.distinct())
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.mapNotNull { it.gameSystemId }.distinct())
        val users = userService.findAllByIds(participates.list.map { it.userId })
        // 感想の内容は隠す（別途取得させる）
        participates = participates.copy(
            list = participates.list.map { it.copy(impression = it.impression?.copy(content = "")) }
        )

        return ParticipatesResponse(
            participates,
            scenarios,
            gameSystems,
            RuleBooks(list = listOf(ruleBook)),
            authors,
            users
        )
    }
}