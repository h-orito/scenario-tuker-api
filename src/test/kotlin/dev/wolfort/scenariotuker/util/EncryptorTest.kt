package dev.wolfort.scenariotuker.util

import dev.wolfort.scenariotuker.ScenarioTukerTest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class EncryptorTest : ScenarioTukerTest() {

    @Autowired
    private lateinit var encryptor: Encryptor

    @Test
    fun test_encrypt() {
        println(encryptor.encrypt("hoge"))
    }
}