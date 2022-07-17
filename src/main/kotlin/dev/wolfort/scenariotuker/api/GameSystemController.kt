package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.scenario.ScenariosResponse
import dev.wolfort.scenariotuker.application.service.AuthorService
import dev.wolfort.scenariotuker.application.service.GameSystemService
import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystem
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemQuery
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/game-systems")
class GameSystemController(
    private val gameSystemService: GameSystemService,
    private val scenarioService: ScenarioService,
    private val authorService: AuthorService
) {
    @GetMapping
    private fun list(): GameSystems = gameSystemService.findAll()

    @GetMapping("/{gameSystemId}")
    private fun get(@PathVariable gameSystemId: Int): GameSystem? = gameSystemService.findById(gameSystemId)

    @GetMapping("/search")
    private fun search(request: SearchRequest): GameSystems = gameSystemService.search(request.toQuery())

    data class SearchRequest(
        var name: String = ""
    ) {
        fun toQuery() = GameSystemQuery(name = name)
    }

    @PostMapping
    private fun post(@RequestBody @Validated request: PostRequest): GameSystem =
        gameSystemService.register(request.toGameSystem())

    @PutMapping
    private fun put(@RequestBody @Validated request: PostRequest): GameSystem =
        gameSystemService.update(request.toGameSystem())

    data class PostRequest(
        val id: Int? = null,
        val name: String = "",
        val dictionaryNames: List<String> = emptyList(),
    ) {
        fun toGameSystem() = GameSystem(
            id = id ?: 0,
            name = name,
            dictionaryNames = dictionaryNames
        )
    }

    @GetMapping("/{gameSystemId}/scenarios")
    private fun gameSystemScenarios(@PathVariable gameSystemId: Int): ScenariosResponse {
        val gameSystem = gameSystemService.findById(gameSystemId)
            ?: throw SystemException("game_system not found. id: $gameSystemId")
        val scenarios = scenarioService.findAllByGameSystemId(gameSystemId)
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        return ScenariosResponse(scenarios, GameSystems(list = listOf(gameSystem)), authors)
    }
}