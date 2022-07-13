package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.api.response.participate.ParticipateResponse
import dev.wolfort.scenariotuker.api.response.participate.ParticipatesResponse
import dev.wolfort.scenariotuker.api.response.user.UserResponse
import dev.wolfort.scenariotuker.application.service.*
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
    private val gameSystemService: GameSystemService,
    private val ruleBookService: RuleBookService,
    private val authorService: AuthorService
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
        var screen_name: String? = null,
    ) {
        fun isEmpty() = name.isNullOrEmpty() && screen_name.isNullOrEmpty()
        fun toQuery() = UserQuery(name = name, screenName = screen_name)
    }

    @GetMapping("/{userId}")
    private fun get(@PathVariable userId: Int): UserResponse? {
        val user = userService.findById(userId) ?: return null
        return UserResponse(user)
    }

    @PostMapping
    private fun post(@RequestBody @Validated request: PostRequest): User =
        userService.register(request.toUserCreateResource())

    data class PostRequest(
        @field:NotNull
        val uid: String = "",
        @field:NotNull
        val name: String = "",
        @field:NotNull
        val screenName: String = "",
        @field:NotNull
        val accessToken: String = "",
        @field:NotNull
        val tokenSecret: String = ""
    ) {
        fun toUserCreateResource() = UserService.UserCreateResource(
            uid = uid,
            name = name,
            screenName = screenName,
            accessToken = accessToken,
            tokenSecret = tokenSecret
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
        val authors = authorService.findAllByIds(scenarios.list.flatMap { it.authorIds }.distinct())
        val gameSystems = gameSystemService.findAllByIds(scenarios.list.mapNotNull { it.gameSystemId }.distinct())
        val ruleBooks = ruleBookService.findAllByIds(participates.list.flatMap { it.ruleBookIds }.distinct())
        val users = userService.findAllByIds(participates.list.map { it.userId })
        val myself = sTukerUser?.let { userService.findByUid(it.uid) }
        // 自分以外の場合感想の内容は隠す（別途取得させる）
        if (users.list.none { it.id == myself?.id }) {
            participates = participates.copy(
                list = participates.list.map { it.copy(impression = it.impression?.copy(content = "")) }
            )
        }

        return ParticipatesResponse(participates, scenarios, gameSystems, ruleBooks, authors, users)
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
        var screenName: String = ""
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
        val authors = authorService.findAllByIds(scenario.authorIds)
        val gameSystem = scenario.gameSystemId?.let { gameSystemService.findById(it) }
        val ruleBooks = ruleBookService.findAllByIds(participate.ruleBookIds)
        return ParticipateResponse(participate, scenario, gameSystem, ruleBooks.list, authors.list, user)
    }

    data class ParticipatePostRequest(
        var id: Int? = null,
        var scenarioId: Int = 0,
        val ruleBookIds: List<Int> = emptyList(),
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
            ruleBookIds = ruleBookIds,
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
        val authors = authorService.findAllByIds(scenario.authorIds)
        val gameSystem = scenario.gameSystemId?.let { gameSystemService.findById(it) }
        val ruleBooks = ruleBookService.findAllByIds(participate.ruleBookIds)
        return ParticipateResponse(participate, scenario, gameSystem, ruleBooks.list, authors.list, user)
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
}