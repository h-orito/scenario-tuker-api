package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.participate.ParticipateResponse
import dev.wolfort.scenariotuker.api.response.participate.ParticipatesResponse
import dev.wolfort.scenariotuker.application.coordinator.ParticipateCoordinator
import dev.wolfort.scenariotuker.application.service.AuthorService
import dev.wolfort.scenariotuker.application.service.GameSystemService
import dev.wolfort.scenariotuker.application.service.ParticipateService
import dev.wolfort.scenariotuker.application.service.RuleBookService
import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.application.service.UserService
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateImpression
import dev.wolfort.scenariotuker.fw.security.ScenarioTukerUser
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/participates")
class ParticipateController(
    private val participateCoordinator: ParticipateCoordinator,
    private val participateService: ParticipateService,
    private val scenarioService: ScenarioService,
    private val gameSystemService: GameSystemService,
    private val ruleBookService: RuleBookService,
    private val authorService: AuthorService,
    private val userService: UserService
) {

    @GetMapping
    private fun list(): ParticipatesResponse {
        val participates = participateService.findAll()
        val scenarios = scenarioService.findAllByIds(participates.list.map { it.scenarioId })
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.flatMap { it.gameSystemIds }.distinct())
        val ruleBooks = ruleBookService.findAllByIds(participates.list.flatMap { it.ruleBookIds }.distinct())
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        val users = userService.findAllByIds(participates.list.map { it.userId })
        return ParticipatesResponse(participates, scenarios, gameSystems, ruleBooks, authors, users)
    }

    @GetMapping("/{participateId}")
    private fun get(@PathVariable participateId: Int): ParticipateResponse? {
        val participate = participateService.findById(participateId) ?: return null
        val scenario = scenarioService.findById(participate.scenarioId)!!
        val gameSystem = participate.gameSystemId?.let { gameSystemService.findById(it) }
        val ruleBooks = ruleBookService.findAllByIds(participate.ruleBookIds)
        val authors = authorService.findAllByIds(scenario.authorIds)
        val user = userService.findById(participate.userId)!!
        return ParticipateResponse(participate, scenario, listOfNotNull(gameSystem), ruleBooks.list, authors.list, user)
    }

    @GetMapping("/{participateId}/impression")
    private fun getImpression(
        @PathVariable participateId: Int,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser?
    ): ParticipateImpression? {
        val myself = sTukerUser?.let { userService.findByUid(it.uid) }
        return participateCoordinator.getImpressionIfAllowed(participateId, myself)
    }
}