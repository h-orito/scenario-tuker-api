package dev.wolfort.scenariotuker.infrastructure.repository

import dev.wolfort.scenariotuker.ScenarioTukerTest
import dev.wolfort.scenariotuker.domain.model.user.TwitterUser
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TwitterRepositoryImplTest : ScenarioTukerTest() {

    @Autowired
    lateinit var twitterRepositoryImpl: TwitterRepositoryImpl

    @Test
    fun test_getUserIdByUsername() {
        val userId = twitterRepositoryImpl.getUserIdByUsername(
            accessToken = "950068507-7QT4pLTalBkhB1SNI4IDEAr9Ycf5RSkofxSyCiyQ",
            tokenSecret = "nLMS65PQiZDQxhEkFUjfZS7Q0UD72RvBLkIjVPdKbXPC8",
            screenName = "ort_dev"
        )
        println(userId)
    }

    @Test
    fun test_getFollowers() {
        val followers = twitterRepositoryImpl.getFollowers(
            TwitterUser(
                id = "950068507",
                screenName = "dummy",
                accessToken = "950068507-7QT4pLTalBkhB1SNI4IDEAr9Ycf5RSkofxSyCiyQ",
                tokenSecret = "nLMS65PQiZDQxhEkFUjfZS7Q0UD72RvBLkIjVPdKbXPC8"
            )
        )
        println(followers)
    }
}