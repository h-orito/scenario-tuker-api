package dev.wolfort.scenariotuker.fw.security

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

data class ScenarioTukerUser(
    val uid: String,
    val authority: Authority
) : UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return mutableListOf(SimpleGrantedAuthority(this.authority.name))
    }

    override fun isEnabled(): Boolean = true
    override fun getUsername(): String = this.uid
    override fun isCredentialsNonExpired(): Boolean = true
    override fun getPassword(): String = ""
    override fun isAccountNonExpired(): Boolean = true
    override fun isAccountNonLocked(): Boolean = true
}
