package dev.wolfort.scenariotuker

import dev.wolfort.dbflute.allcommon.DbDBFluteBeansJavaConfig
import dev.wolfort.scenariotuker.fw.config.FirebaseConfig
import dev.wolfort.scenariotuker.fw.config.ScenarioTukerWebMvcConfigurer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(
    DbDBFluteBeansJavaConfig::class,
    ScenarioTukerWebMvcConfigurer::class,
    FirebaseConfig::class
)
class ScenarioTukerApplication

fun main(args: Array<String>) {
    runApplication<ScenarioTukerApplication>(*args)
}