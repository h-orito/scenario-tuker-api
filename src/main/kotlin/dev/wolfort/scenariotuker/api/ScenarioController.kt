package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.CheckResponse
import dev.wolfort.scenariotuker.api.response.participate.ParticipatesResponse
import dev.wolfort.scenariotuker.api.response.scenario.ScenarioResponse
import dev.wolfort.scenariotuker.api.response.scenario.ScenariosResponse
import dev.wolfort.scenariotuker.application.coordinator.ScenarioCoordinator
import dev.wolfort.scenariotuker.application.service.*
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.domain.model.paging.PagingQuery
import dev.wolfort.scenariotuker.domain.model.participate.Participates
import dev.wolfort.scenariotuker.domain.model.scenario.*
import dev.wolfort.scenariotuker.domain.model.user.UserQuery
import dev.wolfort.scenariotuker.fw.exception.SystemException
import dev.wolfort.scenariotuker.fw.security.ScenarioTukerUser
import org.hibernate.validator.constraints.Length
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.constraints.Max
import javax.validation.constraints.NotNull

@RestController
@RequestMapping("/scenarios")
class ScenarioController(
    private val scenarioCoordinator: ScenarioCoordinator,
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
        var author_name: String? = null,
        var player_num: Int? = null,
        var player_num_empty: Boolean? = null,
        val page_count: Int? = null,
        val page_size: Int? = null,
    ) {
        fun toQuery(): ScenarioQuery {
            val pagingQuery = if (page_count != null && page_size != null) {
                PagingQuery(pageCount = page_count, pageSize = page_size)
            } else null
            return ScenarioQuery(
                name = name,
                gameSystemId = game_system_id,
                gameSystemName = game_system_name,
                type = type,
                authorName = author_name,
                playerNum = player_num,
                playerNumEmpty = player_num_empty,
                paging = pagingQuery
            )
        }
    }

    @GetMapping("/{scenarioId}")
    private fun get(@PathVariable scenarioId: Int): ScenarioResponse? {
        val scenario = scenarioService.findById(scenarioId) ?: return null
        val gameSystem = scenario.gameSystemId?.let { gameSystemService.findById(it) }
        val authors = authorService.findAllByIds(scenario.authorIds)
        return ScenarioResponse(scenario, gameSystem, authors.list)
    }

    @GetMapping("/popular/{type}")
    private fun popular(@PathVariable type: ScenarioType): ScenariosResponse {
        val scenarios = scenarioService.findPopularScenarios(type)
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.mapNotNull { it.gameSystemId }.distinct())
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        return ScenariosResponse(scenarios, gameSystems, authors)
    }

    @GetMapping("/{scenarioId}/also")
    private fun also(@PathVariable scenarioId: Int): ScenariosResponse {
        val scenarios = scenarioService.findAlsoParticipatedScenarios(scenarioId)
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.mapNotNull { it.gameSystemId }.distinct())
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        return ScenariosResponse(scenarios, gameSystems, authors)
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
        @field:Length(max = 255)
        var url: String? = null,
        var gameSystemId: Int? = null,
        var authorIds: List<Int> = emptyList(),
        @field:Length(max = 50)
        val gameMasterRequirement: String? = null,
        @field:Max(100)
        val playerNumMin: Int? = null,
        @field:Max(100)
        val playerNumMax: Int? = null,
        @field:Max(1000)
        val requiredHours: Int? = null
    ) {
        fun toScenario() = Scenario(
            id = id ?: 0,
            name = name,
            dictionaryNames = dictionaryNames,
            type = type,
            url = url?.let { ScenarioUrl(it) },
            gameSystemId = gameSystemId,
            authorIds = authorIds,
            gameMasterRequirement = gameMasterRequirement,
            playerNumMin = playerNumMin,
            playerNumMax = playerNumMax,
            requiredHours = requiredHours
        )
    }

    @DeleteMapping("/{scenarioId}")
    private fun delete(@PathVariable scenarioId: Int) = scenarioService.delete(scenarioId)

    @DeleteMapping("/{scenarioId}/check")
    private fun deleteCheck(@PathVariable scenarioId: Int): CheckResponse {
        return try {
            scenarioService.deleteCheck(scenarioId)
            CheckResponse(true, null)
        } catch (e: Exception) {
            CheckResponse(false, e.message)
        }
    }

    @PutMapping("/{scenarioId}/integrate")
    private fun integrateDelete(
        @PathVariable scenarioId: Int,
        @RequestBody @Validated request: IntegrateDeleteRequest
    ) = scenarioCoordinator.integrateDelete(scenarioId, request.destId!!)

    data class IntegrateDeleteRequest(
        @field:NotNull
        val destId: Int? = null
    )

    @GetMapping("/{scenarioId}/participates")
    private fun scenarioParticipates(
        @PathVariable scenarioId: Int,
        request: ParticipateSearchRequest,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser?
    ): ParticipatesResponse {
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
        if (request.is_twitter_following == true) {
            val user = sTukerUser?.let { userService.findByUid(it.uid) }
            val followingUsers =
                userService.search(UserQuery(name = null, screenName = null, isTwitterFollowing = true), user)
            participates = Participates(list = participates.list.filter { p ->
                followingUsers.list.any { it.id == p.userId }
            })
        }

        return ParticipatesResponse(
            participates,
            Scenarios(list = listOf(scenario)),
            GameSystems(list = listOfNotNull(gameSystem)),
            ruleBooks,
            authors,
            users
        )
    }

    data class ParticipateSearchRequest(
        val is_twitter_following: Boolean? = null
    )
}