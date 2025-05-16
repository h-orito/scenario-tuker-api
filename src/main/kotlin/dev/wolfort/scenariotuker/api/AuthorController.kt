package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.scenario.ScenariosResponse
import dev.wolfort.scenariotuker.application.service.AuthorService
import dev.wolfort.scenariotuker.application.service.GameSystemService
import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.domain.model.author.Author
import dev.wolfort.scenariotuker.domain.model.author.AuthorQuery
import dev.wolfort.scenariotuker.domain.model.author.Authors
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotNull

@RestController
@RequestMapping("/authors")
class AuthorController(
    private val authorService: AuthorService,
    private val scenarioService: ScenarioService,
    private val gameSystemService: GameSystemService
) {

    @GetMapping
    private fun list(): Authors = authorService.findAll()

    @GetMapping("/search")
    private fun search(request: SearchRequest): Authors = authorService.search(request.toQuery())

    data class SearchRequest(
        @field:NotNull
        var name: String? = "",
    ) {
        fun toQuery() = AuthorQuery(name = name!!)
    }

    @GetMapping("/{authorId}")
    private fun get(@PathVariable authorId: Int): Author? = authorService.findById(authorId)

    @PostMapping
    private fun post(@RequestBody @Validated request: PostRequest): Author =
        authorService.register(request.toAuthor())

    @PutMapping
    private fun put(@RequestBody @Validated request: PostRequest): Author =
        authorService.update(request.toAuthor())

    data class PostRequest(
        var id: Int? = null,
        @field:NotNull
        var name: String = "",
    ) {
        fun toAuthor() = Author(
            id = id ?: 0,
            name = name
        )
    }

    @GetMapping("/{authorId}/scenarios")
    private fun getAuthorScenarios(@PathVariable authorId: Int): ScenariosResponse {
        val scenarios = scenarioService.findAllByAuthorId(authorId)
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.flatMap { it.gameSystemIds }.distinct())
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        return ScenariosResponse(scenarios, gameSystems, authors)
    }
}