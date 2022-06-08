package dev.wolfort.scenariotuker.api

import dev.wolfort.scenariotuker.application.service.UserService
import dev.wolfort.scenariotuker.domain.model.user.User
import dev.wolfort.scenariotuker.domain.model.user.Users
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService
) {

    @GetMapping
    private fun list(): Users = userService.findAll()

    @GetMapping("/{userId}")
    private fun get(@PathVariable userId: Int): User? = userService.findById(userId)

    @PostMapping
    private fun post(resource: UserService.UserCreateResource): User = userService.register(resource)

    @PutMapping
    private fun put(user: User): User = userService.update(user)
}