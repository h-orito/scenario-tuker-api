package dev.wolfort.scenariotuker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ScenarioTukerApplication

fun main(args: Array<String>) {
	runApplication<ScenarioTukerApplication>(*args)
}