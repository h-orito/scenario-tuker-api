package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.participate.ParticipateResponse
import dev.wolfort.scenariotuker.api.response.participate.ParticipatesResponse
import dev.wolfort.scenariotuker.api.response.user.UserResponse
import dev.wolfort.scenariotuker.application.service.ParticipateService
import dev.wolfort.scenariotuker.application.service.RuleBookService
import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.application.service.UserService
import dev.wolfort.scenariotuker.domain.model.participate.DisclosureRange
import dev.wolfort.scenariotuker.domain.model.participate.Participate
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateImpression
import dev.wolfort.scenariotuker.domain.model.participate.RoleType
import dev.wolfort.scenariotuker.domain.model.user.User
import dev.wolfort.scenariotuker.domain.model.user.UserQuery
import dev.wolfort.scenariotuker.domain.model.user.Users
import dev.wolfort.scenariotuker.fw.exception.SystemException
import dev.wolfort.scenariotuker.fw.security.ScenarioTukerUser
import org.hibernate.validator.constraints.Length
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
import javax.validation.constraints.NotNull

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService,
    private val participateService: ParticipateService,
    private val scenarioService: ScenarioService,
    private val ruleBookService: RuleBookService
) {

    @GetMapping
    private fun list(): Users = userService.findAll()

    @GetMapping("/search")
    private fun search(request: SearchRequest): Users {
        if (request.isEmpty()) throw SystemException("query is empty.")
        return userService.search(request.toQuery())
    }

    data class SearchRequest(
        var name: String? = null,
        var twitter_user_name: String? = null,
    ) {
        fun isEmpty() = name.isNullOrEmpty() && twitter_user_name.isNullOrEmpty()
        fun toQuery() = UserQuery(name = name, twitterUserName = twitter_user_name)
    }

    @GetMapping("/{userId}")
    private fun get(@PathVariable userId: Int): UserResponse? {
        val user = userService.findById(userId) ?: return null
        val users = userService.findAllByIds((user.follows + user.followers).distinct())
        return UserResponse(user, users)
    }

    @PostMapping
    private fun post(@RequestBody @Validated request: PostRequest): User =
        userService.register(request.toUserCreateResource())

    data class PostRequest(
        val uid: String = "",
        val name: String = "",
        val twitterUserName: String? = null
    ) {
        fun toUserCreateResource() = UserService.UserCreateResource(
            uid = uid,
            name = name,
            twitterUserName = twitterUserName
        )
    }

    @GetMapping("/{userId}/participates")
    private fun userParticipates(
        @PathVariable userId: Int,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser?
    ): ParticipatesResponse {
        userService.findById(userId) ?: throw SystemException("user not found. user_id: $userId")
        var participates = participateService.findAllByUserId(userId)
        val scenarios = scenarioService.findAllByIds(participates.list.map { it.scenarioId })
        val ruleBooks = ruleBookService.findAllByIds(scenarios.list.mapNotNull { it.ruleBookId })
        val users = userService.findAllByIds(participates.list.map { it.userId })
        val myself = sTukerUser?.let { userService.findByUid(it.uid) }
        // 自分以外の場合感想の内容は隠す（別途取得させる）
        if (users.list.none { it.id == myself?.id }) {
            participates = participates.copy(
                list = participates.list.map { it.copy(impression = it.impression?.copy(content = "")) }
            )
        }

        return ParticipatesResponse(participates, scenarios, ruleBooks, users)
    }

    @GetMapping("/myself")
    private fun getMyself(
        @AuthenticationPrincipal user: ScenarioTukerUser?,
    ): User? = user?.let { userService.findByUid(user.uid) }

    @PutMapping("/myself")
    private fun myself(
        @AuthenticationPrincipal user: ScenarioTukerUser,
        @RequestBody body: MyselfPutRequest
    ): User {
        return userService.update(body.toUpdateResource(user.uid))
    }

    data class MyselfPutRequest(
        var name: String = "",
        var twitterUserName: String? = null
    ) {
        fun toUpdateResource(uid: String) = UserService.UserUpdateResource(
            uid = uid,
            name = name
        )
    }

    @PostMapping("/myself/participates")
    private fun post(
        @RequestBody @Validated request: ParticipatePostRequest,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser
    ): ParticipateResponse {
        val user = userService.findByUid(sTukerUser.uid)
            ?: throw SystemException("user not found. user_id: ${sTukerUser.uid}")
        val participate = participateService.register(request.toParticipate(user.id))
        val scenario = scenarioService.findById(participate.scenarioId)!!
        val ruleBook = scenario.ruleBookId?.let { ruleBookService.findById(it) }
        return ParticipateResponse(participate, scenario, ruleBook, user)
    }

    data class ParticipatePostRequest(
        var id: Int? = null,
        var scenarioId: Int = 0,
        var roleTypes: List<RoleType> = emptyList(),
        var dispOrder: Int? = 0,
        @Valid
        var impression: ParticipateImpressionPostRequest? = null
    ) {

        data class ParticipateImpressionPostRequest(
            var hasSpoiler: Boolean = true,
            var disclosureRange: DisclosureRange = DisclosureRange.OnlyMe,
            @field:Length(max = 10000)
            var content: String? = null
        )

        fun toParticipate(userId: Int) = Participate(
            id = id ?: 0,
            scenarioId = scenarioId,
            userId = userId,
            roleTypes = roleTypes,
            dispOrder = dispOrder ?: 0,
            impression = if (impression?.content.isNullOrBlank()) null else ParticipateImpression(
                hasSpoiler = impression!!.hasSpoiler,
                disclosureRange = impression!!.disclosureRange,
                content = impression!!.content!!.trim()
            )
        )
    }

    @PutMapping("/myself/participates")
    private fun put(
        @RequestBody request: ParticipatePostRequest,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser
    ): ParticipateResponse {
        val user = userService.findByUid(sTukerUser.uid)
            ?: throw SystemException("user not found. user_id: ${sTukerUser.uid}")
        val participate = participateService.update(request.toParticipate(user.id))
        val scenario = scenarioService.findById(participate.scenarioId)!!
        val ruleBook = scenario.ruleBookId?.let { ruleBookService.findById(it) }
        return ParticipateResponse(participate, scenario, ruleBook, user)
    }

    @DeleteMapping("/myself/participates/{participateId}")
    private fun delete(
        @PathVariable participateId: Int,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser
    ) {
        val user = userService.findByUid(sTukerUser.uid)
            ?: throw SystemException("user not found. user_id: ${sTukerUser.uid}")
        val participates = participateService.findAllByUserId(user.id)
        if (participates.list.none { it.id == participateId }) {
            throw SystemException("自分のものしか削除できません。 participateId: $participateId")
        }
        participateService.delete(participateId)
    }

    @PostMapping("/myself/follow")
    private fun postFollow(
        @RequestBody @Validated request: FollowPostRequest,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser
    ): User {
        val user = userService.findByUid(sTukerUser.uid)
            ?: throw SystemException("user not found. user_id: ${sTukerUser.uid}")
        userService.follow(user.id, request.userId!!)
        return userService.findById(user.id)!!
    }

    @DeleteMapping("/myself/follow/{userId}")
    private fun deleteFollow(
        @PathVariable userId: Int,
        @AuthenticationPrincipal sTukerUser: ScenarioTukerUser
    ): User {
        val user = userService.findByUid(sTukerUser.uid)
            ?: throw SystemException("user not found. user_id: ${sTukerUser.uid}")
        userService.unfollow(user.id, userId)
        return userService.findById(user.id)!!
    }

    data class FollowPostRequest(
        @field:NotNull
        var userId: Int? = null
    )
}