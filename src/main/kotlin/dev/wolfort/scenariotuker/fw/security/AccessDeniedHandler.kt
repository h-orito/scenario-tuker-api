package dev.wolfort.scenariotuker.fw.security

import org.springframework.http.HttpStatus
import org.springframework.security.web.access.AccessDeniedHandler
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class AccessDeniedHandler : AccessDeniedHandler {

    // 403とデフォルトメッセージを返すだけにしておく
    @Throws(IOException::class, ServletException::class)
    override fun handle(request: HttpServletRequest,
                        response: HttpServletResponse,
                        exception: org.springframework.security.access.AccessDeniedException) {
        response.sendError(HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.reasonPhrase)
    }
}
