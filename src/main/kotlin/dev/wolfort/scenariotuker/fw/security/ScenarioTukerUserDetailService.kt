package dev.wolfort.scenariotuker.fw.security

import dev.wolfort.scenariotuker.domain.model.user.TwitterUser
import dev.wolfort.scenariotuker.domain.model.user.User
import dev.wolfort.scenariotuker.domain.model.user.UserRepository
import org.dbflute.hook.AccessContext
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service("scenarioTukerUserDetailsService")
class ScenarioTukerUserDetailService(
    private val userRepository: UserRepository
) : UserDetailsService {

    // ===================================================================================
    //                                                                             Execute
    //                                                                           =========
    override fun loadUserByUsername(uid: String?): UserDetails {
        uid ?: throw UsernameNotFoundException("uid is empty")
        val user = userRepository.findByUid(uid) ?: throw UsernameNotFoundException("user not found for uid: $uid")
        return ScenarioTukerUser(
            uid = user.uid,
            authority = user.authority
        )
    }

    fun register(uid: String): UserDetails {
        val context = AccessContext()
        context.accessUser = uid
        context.accessLocalDateTime = LocalDateTime.now()
        AccessContext.setAccessContextOnThread(context)

        userRepository.register(
            User(
                id = 0,
                uid = uid,
                authority = Authority.User,
                name = "未設定",
                twitter = TwitterUser(
                    id = "dummy",
                    screenName = "未設定",
                    accessToken = "dummy",
                    tokenSecret = "dummy"
                )
            )
        )
        return ScenarioTukerUser(
            uid = uid,
            authority = Authority.User
        )
    }
}