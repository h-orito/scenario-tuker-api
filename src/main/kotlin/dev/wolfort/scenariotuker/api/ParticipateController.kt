package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.participate.ParticipateResponse
import dev.wolfort.scenariotuker.api.response.participate.ParticipatesResponse
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
    private val participateService: ParticipateService,
    private val scenarioService: ScenarioService,
    private val ruleBookService: RuleBookService,
    private val userService: UserService
) {

    @GetMapping
    private fun list(): ParticipatesResponse {
        val participates = participateService.findAll()
        val scenarios = scenarioService.findAllByIds(participates.list.map { it.scenarioId })
        val ruleBooks = ruleBookService.findAllByIds(scenarios.list.mapNotNull { it.ruleBookId })
        val users = userService.findAllByIds(participates.list.map { it.userId })
        return ParticipatesResponse(participates, scenarios, ruleBooks, users)
    }

    @GetMapping("/{participateId}")
    private fun get(@PathVariable participateId: Int): ParticipateResponse? {
        val participate = participateService.findById(participateId) ?: return null
        val scenario = scenarioService.findById(participate.scenarioId)!!
        val ruleBook = scenario.ruleBookId?.let { ruleBookService.findById(it) }
        val user = userService.findById(participate.userId)!!
        return ParticipateResponse(participate, scenario, ruleBook, user)
    }

    @GetMapping("/{participateId}/impression")
    private fun getImpression(
        @PathVariable participateId: Int,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser?
    ): ParticipateImpression? {
        val myself = sTukerUser?.let { userService.findByUid(it.uid) }
        val participate = participateService.findById(participateId) ?: return null
        val user = userService.findById(participate.userId)!!
        return if (participate.canViewImpression(user, myself)) participate.impression
        else null
    }
}