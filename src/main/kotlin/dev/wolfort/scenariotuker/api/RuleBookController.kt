package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.CheckResponse
import dev.wolfort.scenariotuker.api.response.participate.ParticipatesResponse
import dev.wolfort.scenariotuker.api.response.rulebook.RuleBookResponse
import dev.wolfort.scenariotuker.api.response.rulebook.RuleBooksResponse
import dev.wolfort.scenariotuker.application.coordinator.RuleBookCoordinator
import dev.wolfort.scenariotuker.application.service.AuthorService
import dev.wolfort.scenariotuker.application.service.GameSystemService
import dev.wolfort.scenariotuker.application.service.ParticipateService
import dev.wolfort.scenariotuker.application.service.RuleBookService
import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.application.service.UserService
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBook
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookQuery
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBookType
import dev.wolfort.scenariotuker.domain.model.rulebook.RuleBooks
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotNull

@RestController
@RequestMapping("/rule-books")
class RuleBookController(
    private val ruleBookCoordinator: RuleBookCoordinator,
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
        val game_system_name: String? = null,
        val rule_book_type: RuleBookType? = null
    ) {
        fun toQuery() = RuleBookQuery(
            name = name,
            gameSystemId = game_system_id,
            gameSystemName = game_system_name,
            ruleBookType = rule_book_type
        )
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

    @DeleteMapping("/{ruleBookId}")
    private fun delete(@PathVariable ruleBookId: Int) = ruleBookService.delete(ruleBookId)

    @DeleteMapping("/{ruleBookId}/check")
    private fun deleteCheck(@PathVariable ruleBookId: Int): CheckResponse {
        return try {
            ruleBookService.deleteCheck(ruleBookId)
            CheckResponse(true, null)
        } catch (e: Exception) {
            CheckResponse(false, e.message)
        }
    }

    @PutMapping("/{ruleBookId}/integrate")
    private fun integrateDelete(
        @PathVariable ruleBookId: Int,
        @RequestBody @Validated request: IntegrateDeleteRequest
    ) = ruleBookCoordinator.integrateDelete(ruleBookId, request.destId!!)

    data class IntegrateDeleteRequest(
        @field:NotNull
        val destId: Int? = null
    )

    @GetMapping("/{ruleBookId}/participates")
    private fun ruleBookParticipates(@PathVariable ruleBookId: Int): ParticipatesResponse {
        val ruleBook =
            ruleBookService.findById(ruleBookId) ?: throw SystemException("rule_book not found. id: $ruleBookId")
        var participates = participateService.findAllByRuleBookId(ruleBookId)
        val scenarios = scenarioService.findAllByIds(participates.list.map { it.scenarioId }.distinct())
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.flatMap { it.gameSystemIds }.distinct())
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