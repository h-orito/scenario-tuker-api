package dev.wolfort.participatetuker.api

import dev.wolfort.scenariotuker.application.service.ParticipateService
import dev.wolfort.scenariotuker.domain.model.participate.Participate
import dev.wolfort.scenariotuker.domain.model.participate.Participates
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/participates")
class ParticipateController(
    private val participateService: ParticipateService
) {

    @GetMapping
    private fun list(): Participates = participateService.findAll()

    @GetMapping("/{participateId}")
    private fun get(@PathVariable participateId: Int): Participate? = participateService.findById(participateId)

    @PostMapping
    private fun post(resource: ParticipateService.ParticipateCreateResource): Participate =
        participateService.register(resource)

    @PutMapping
    private fun put(participate: Participate): Participate = participateService.update(participate)

    @DeleteMapping("/{participateId}")
    private fun delete(@PathVariable participateId: Int) = participateService.delete(participateId)
}