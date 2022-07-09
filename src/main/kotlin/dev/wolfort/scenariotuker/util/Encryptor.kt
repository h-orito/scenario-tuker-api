package dev.wolfort.scenariotuker.util

import org.springframework.beans.factory.annotation.Value
import org.springframework.security.crypto.encrypt.Encryptors
import org.springframework.security.crypto.encrypt.TextEncryptor
import org.springframework.stereotype.Component


@Component
class Encryptor {

    @Value("\${encrypt.secret:}")
    private val secret: String? = null

    @Value("\${encrypt.salt:}")
    private val salt: String? = null

    fun encrypt(str: String): String {
        return try {
            encryptor().encrypt(str)
        } catch (e: Exception) {
            str
        }
    }

    fun decrypt(encrypted: String): String {
        return try {
            encryptor().decrypt(encrypted)
        } catch( e: Exception) {
            encrypted
        }
    }

    private fun encryptor(): TextEncryptor = Encryptors.delux(secret, salt)
}