package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.participate.ParticipatesResponse
import dev.wolfort.scenariotuker.api.response.scenario.ScenarioResponse
import dev.wolfort.scenariotuker.api.response.scenario.ScenariosResponse
import dev.wolfort.scenariotuker.application.service.*
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.domain.model.scenario.*
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/scenarios")
class ScenarioController(
    private val scenarioService: ScenarioService,
    private val gameSystemService: GameSystemService,
    private val ruleBookService: RuleBookService,
    private val authorService: AuthorService,
    private val participateService: ParticipateService,
    private val userService: UserService
) {

    @GetMapping
    private fun list(): ScenariosResponse {
        val scenarios = scenarioService.findAll()
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.mapNotNull { it.gameSystemId }.distinct())
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        return ScenariosResponse(scenarios, gameSystems, authors)
    }

    @GetMapping("/search")
    private fun search(request: SearchRequest): ScenariosResponse {
        val query = request.toQuery()
        if (query.isEmpty()) throw SystemException("scenario query is empty.")
        val scenarios = scenarioService.search(request.toQuery())
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.mapNotNull { it.gameSystemId }.distinct())
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        return ScenariosResponse(scenarios, gameSystems, authors)
    }

    data class SearchRequest(
        var name: String? = null,
        var game_system_id: Int? = null,
        var game_system_name: String? = null,
        var type: ScenarioType? = null,
        var author_name: String? = null
    ) {
        fun toQuery() =
            ScenarioQuery(
                name = name,
                gameSystemId = game_system_id,
                gameSystemName = game_system_name,
                type = type,
                authorName = author_name
            )
    }

    @GetMapping("/{scenarioId}")
    private fun get(@PathVariable scenarioId: Int): ScenarioResponse? {
        val scenario = scenarioService.findById(scenarioId) ?: return null
        val gameSystem = scenario.gameSystemId?.let { gameSystemService.findById(it) }
        val authors = authorService.findAllByIds(scenario.authorIds)
        return ScenarioResponse(scenario, gameSystem, authors.list)
    }

    @PostMapping
    private fun post(@RequestBody @Validated request: PostRequest): ScenarioResponse {
        val scenario = scenarioService.register(request.toScenario())
        val gameSystem = scenario.gameSystemId?.let { gameSystemService.findById(it) }
        val authors = authorService.findAllByIds(scenario.authorIds)
        return ScenarioResponse(scenario, gameSystem, authors.list)
    }

    @PutMapping
    private fun put(@RequestBody @Validated request: PostRequest): ScenarioResponse {
        val updated = scenarioService.update(request.toScenario())
        val gameSystem = updated.gameSystemId?.let { gameSystemService.findById(it) }
        val authors = authorService.findAllByIds(updated.authorIds)
        return ScenarioResponse(updated, gameSystem, authors.list)
    }

    data class PostRequest(
        var id: Int? = null,
        var name: String = "",
        var dictionaryNames: List<String> = emptyList(),
        var type: ScenarioType = ScenarioType.MurderMystery,
        var url: String? = null,
        var gameSystemId: Int? = null,
        var authorIds: List<Int> = emptyList()
    ) {
        fun toScenario() = Scenario(
            id = id ?: 0,
            name = name,
            dictionaryNames = dictionaryNames,
            type = type,
            url = url?.let { ScenarioUrl(it) },
            gameSystemId = gameSystemId,
            authorIds = authorIds
        )
    }

    @GetMapping("/{scenarioId}/participates")
    private fun scenarioParticipates(@PathVariable scenarioId: Int): ParticipatesResponse {
        val scenario =
            scenarioService.findById(scenarioId) ?: throw SystemException("scenario not found. id: $scenarioId")
        var participates = participateService.findAllByScenarioId(scenarioId)
        val authors = authorService.findAllByIds(scenario.authorIds)
        val gameSystem = scenario.gameSystemId?.let { gameSystemService.findById(it) }
        val ruleBooks = ruleBookService.findAllByIds(participates.list.flatMap { it.ruleBookIds }.distinct())
        val users = userService.findAllByIds(participates.list.map { it.userId })
        // 感想の内容は隠す（別途取得させる）
        participates = participates.copy(
            list = participates.list.map { it.copy(impression = it.impression?.copy(content = "")) }
        )

        return ParticipatesResponse(
            participates,
            Scenarios(list = listOf(scenario)),
            GameSystems(list = listOfNotNull(gameSystem)),
            ruleBooks,
            authors,
            users
        )
    }
}