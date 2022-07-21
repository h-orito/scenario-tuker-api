package dev.wolfort.scenariotuker.fw.config

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import java.time.format.DateTimeFormatter

@Configuration
class ScenarioTukerAppConfig {

    @Bean
    fun objectMapperBuilder(): Jackson2ObjectMapperBuilder {
        val builder = Jackson2ObjectMapperBuilder()
        // ISO8601
        builder.serializers(LocalDateSerializer(DateTimeFormatter.ISO_DATE))
        builder.serializers(LocalDateTimeSerializer(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
        builder.propertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
        return builder
    }
}