package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.scenario.ScenarioResponse
import dev.wolfort.scenariotuker.api.response.scenario.ScenariosResponse
import dev.wolfort.scenariotuker.application.service.RuleBookService
import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioQuery
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/scenarios")
class ScenarioController(
    private val scenarioService: ScenarioService,
    private val ruleBookService: RuleBookService
) {

    @GetMapping
    private fun list(): ScenariosResponse {
        val scenarios = scenarioService.findAll()
        val ruleBooks = ruleBookService.findAllByIds(scenarios.list.mapNotNull { it.ruleBookId })
        return ScenariosResponse(scenarios, ruleBooks)
    }

    @GetMapping("/search")
    private fun search(request: SearchRequest): ScenariosResponse {
        val scenarios = scenarioService.search(request.toQuery())
        val ruleBooks = ruleBookService.findAllByIds(scenarios.list.mapNotNull { it.ruleBookId })
        return ScenariosResponse(scenarios, ruleBooks)
    }

    data class SearchRequest(
        var name: String? = "",
        var ruleBookId: Int? = null,
        var type: ScenarioType = ScenarioType.MurderMystery
    ) {
        fun toQuery() = ScenarioQuery(name = name, ruleBookId = ruleBookId, type = type)
    }

    @GetMapping("/{scenarioId}")
    private fun get(@PathVariable scenarioId: Int): ScenarioResponse? {
        val scenario = scenarioService.findById(scenarioId) ?: return null
        val ruleBook = scenario.ruleBookId?.let { ruleBookService.findById(it) }
        return ScenarioResponse(scenario, ruleBook)
    }

    @PostMapping
    private fun post(@RequestBody @Validated request: PostRequest): ScenarioResponse {
        val scenario = scenarioService.register(request.toScenario())
        val ruleBook = scenario.ruleBookId?.let { ruleBookService.findById(it) }
        return ScenarioResponse(scenario, ruleBook)
    }

    @PutMapping
    private fun put(@RequestBody @Validated request: PostRequest): ScenarioResponse {
        val updated = scenarioService.update(request.toScenario())
        val ruleBook = updated.ruleBookId?.let { ruleBookService.findById(it) }
        return ScenarioResponse(updated, ruleBook)
    }

    data class PostRequest(
        var id: Int? = null,
        var name: String = "",
        var dictionaryNames: List<String> = emptyList(),
        var type: ScenarioType = ScenarioType.MurderMystery,
        var ruleBookId: Int? = null,
    ) {
        fun toScenario() = Scenario(
            id = id ?: 0,
            name = name,
            dictionaryNames = dictionaryNames,
            type = type,
            ruleBookId = ruleBookId
        )
    }

    @DeleteMapping("/{scenarioId}")
    private fun delete(@PathVariable scenarioId: Int) = scenarioService.delete(scenarioId)
}