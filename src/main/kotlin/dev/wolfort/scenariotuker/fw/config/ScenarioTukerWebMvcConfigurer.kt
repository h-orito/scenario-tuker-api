package dev.wolfort.scenariotuker.fw.config

import dev.wolfort.scenariotuker.fw.interceptor.AccessContextInterceptor
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

class ScenarioTukerWebMvcConfigurer : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(AccessContextInterceptor()).addPathPatterns("/**")
    }
}