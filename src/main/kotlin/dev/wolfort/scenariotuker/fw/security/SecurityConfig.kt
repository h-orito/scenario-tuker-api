package dev.wolfort.scenariotuker.fw.security

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.access.AccessDeniedHandler
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@Configuration
@ConfigurationProperties(prefix = "security")
class SecurityConfig {

    // CORSを許可するドメイン
    lateinit var corsClientUrls: List<String>

    @Bean
    @Throws(Exception::class)
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests {
                it
                    .anyRequest()
                    .permitAll()
            }.exceptionHandling {
                it
                    .authenticationEntryPoint(authenticationEntryPoint())
                    .accessDeniedHandler(accessDeniedHandler())
            }.csrf {
                it.disable()
            }.cors {
                it.configurationSource(getCorsConfigurationSource())
            }
        return http.build()
    }

    private fun authenticationEntryPoint(): AuthenticationEntryPoint {
        return AuthenticationEntryPoint()
    }

    private fun accessDeniedHandler(): AccessDeniedHandler {
        return AccessDeniedHandler()
    }

    /**
     * see https://rennnosukesann.hatenablog.com/entry/2019/09/18/235731
     */
    private fun getCorsConfigurationSource(): CorsConfigurationSource {
        val corsConfiguration = CorsConfiguration()

        // CORSを許可するURLの登録(Access-Control-Allow-Origin)
        this.corsClientUrls.forEach { corsConfiguration.addAllowedOrigin(it) }

        // 許可するHeaderの登録(Access-Control-Allow-Headers)
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL)

        // 許可するMethodの登録(Access-Control-AllowMethods)
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL)

        // 認証情報送信許可の登録(Access-Control-Allow-Credentials)
        corsConfiguration.allowCredentials = true

        val corsSource = UrlBasedCorsConfigurationSource()

        // どのパスに上記ルールを適用するか
        corsSource.registerCorsConfiguration("/**", corsConfiguration)

        return corsSource
    }
}