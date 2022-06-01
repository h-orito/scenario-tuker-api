package dev.wolfort.scenariotuker.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    @GetMapping("/ping")
    private fun ping(): Ping = Ping()

    data class Ping(val ping: String = "pong")
}