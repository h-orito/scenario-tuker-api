package dev.wolfort.scenariotuker.fw.security

import com.google.firebase.auth.FirebaseAuth
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * see https://qiita.com/mr-hisa-child/items/5ed2ae2fe4c86d4bb5c7
 */
@Component
class LoginFilter(
    private val userService: ScenarioTukerUserDetailService
) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        // コンテキストにログインユーザ情報をセット
        SecurityContextHolder.getContext().authentication = PreAuthenticatedAuthenticationToken(
            auth(request), null
        )

        filterChain.doFilter(request, response)
    }

    // ログインユーザ情報を取得
    private fun auth(request: HttpServletRequest): UserDetails? {

        // リクエストヘッダからJWTを取り出す
        val token: String = getToken(request) ?: return null

        try {
            // JWTを検証、uid取得
            val firebaseToken = FirebaseAuth.getInstance().verifyIdToken(token)
                ?: throw BadCredentialsException("改竄リクエストまたはトークン有効期限切れです")
            val uid = firebaseToken.uid

            // ユーザ情報を検索
            return try {
                userService.loadUserByUsername(uid) as ScenarioTukerUser
            } catch (e: UsernameNotFoundException) {
                // ユーザを新規作成
//                userService.register(uid)
                null
            }
        } catch (e: Exception) {
            throw BadCredentialsException(e.message, e)
        }
    }

    // リクエストヘッダからトークンを取得
    private fun getToken(request: HttpServletRequest): String? {
        val token: String? = request.getHeader("Authorization")
        if (token == null || !token.startsWith("Bearer ")) {
            return null
        }
        return token.substring("Bearer ".length)
    }
}