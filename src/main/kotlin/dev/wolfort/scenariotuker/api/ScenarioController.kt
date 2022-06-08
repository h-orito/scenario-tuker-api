package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/scenarios")
class ScenarioController(
    private val scenarioService: ScenarioService
) {

    @GetMapping
    private fun list(): Scenarios = scenarioService.findAll()

    @GetMapping("/{scenarioId}")
    private fun get(@PathVariable scenarioId: Int): Scenario? = scenarioService.findById(scenarioId)

    @PostMapping
    private fun post(resource: ScenarioService.ScenarioCreateResource): Scenario = scenarioService.register(resource)

    @PutMapping
    private fun put(scenario: Scenario): Scenario = scenarioService.update(scenario)

    @DeleteMapping("/{scenarioId}")
    private fun delete(@PathVariable scenarioId: Int) = scenarioService.delete(scenarioId)
}