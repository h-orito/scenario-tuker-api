package dev.wolfort.scenariotuker.fw.interceptor

import dev.wolfort.scenariotuker.fw.security.ScenarioTukerUser
import org.dbflute.hook.AccessContext
import org.springframework.web.servlet.HandlerInterceptor
import java.time.LocalDateTime
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class AccessContextInterceptor : HandlerInterceptor {

    @Throws(Exception::class)
    override fun preHandle(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any
    ): Boolean {
        val userInfo: ScenarioTukerUser? = ScenarioTukerUserInfoUtil.getUserInfo()
        val accessUser = userInfo?.username ?: "not_login_user"

        val context = AccessContext()
        context.accessLocalDateTime = LocalDateTime.now()
        context.accessUser = accessUser
        AccessContext.setAccessContextOnThread(context)

        // Handlerメソッドを呼び出す場合はtrueを返却する
        return true
    }
}