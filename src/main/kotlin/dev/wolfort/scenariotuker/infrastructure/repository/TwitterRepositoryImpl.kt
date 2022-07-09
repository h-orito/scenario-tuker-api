package dev.wolfort.scenariotuker.infrastructure.repository

import dev.wolfort.scenariotuker.domain.model.user.TwitterRepository
import dev.wolfort.scenariotuker.domain.model.user.TwitterUser
import io.github.redouane59.twitter.TwitterClient
import io.github.redouane59.twitter.signature.TwitterCredentials
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Repository

@Repository
class TwitterRepositoryImpl : TwitterRepository {

    private val logger = LoggerFactory.getLogger(TwitterRepositoryImpl::class.java)

    @Value("\${twitter.oauth.consumer-key:}")
    private val consumerKey: String? = null

    @Value("\${twitter.oauth.consumer-secret:}")
    private val consumerSecret: String? = null

    override fun getUserIdByUsername(
        accessToken: String,
        tokenSecret: String,
        screenName: String
    ): String? {
        if (consumerKey.isNullOrEmpty()) return null
        val client = createClient(accessToken, tokenSecret)
        return client.getUserFromUserName(screenName)?.id
    }

    override fun getFollowings(user: TwitterUser): List<TwitterUser> {
        if (consumerKey.isNullOrEmpty()) return emptyList()
        val client = createClient(user.accessToken, user.tokenSecret)
        return client.getFollowing(user.id).data.map {
            TwitterUser(
                id = it.id,
                screenName = it.name,
                accessToken = "dummy",
                tokenSecret = "dummy"
            )
        }
    }

    override fun getFollowers(user: TwitterUser): List<TwitterUser> {
        if (consumerKey.isNullOrEmpty()) return emptyList()
        val client = createClient(user.accessToken, user.tokenSecret)
        return client.getFollowers(user.id).data.map {
            TwitterUser(
                id = it.id,
                screenName = it.name,
                accessToken = "dummy",
                tokenSecret = "dummy"
            )
        }
    }

    private fun createClient(
        accessToken: String,
        tokenSecret: String
    ): TwitterClient {
        return TwitterClient(
            TwitterCredentials.builder()
                .accessToken(accessToken)
                .accessTokenSecret(tokenSecret)
                .apiKey(consumerKey)
                .apiSecretKey(consumerSecret)
                .build()
        )
    }
}