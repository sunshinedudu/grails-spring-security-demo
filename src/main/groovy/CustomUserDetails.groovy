package demo

import grails.plugin.springsecurity.userdetails.GrailsUser
import org.springframework.security.core.GrantedAuthority

class CustomUserDetails extends GrailsUser
{

    final boolean loginBySms
    final Date lastPasswordModifiedDate
    final boolean fixedIp
    final String ip
    final String verificationCode

    CustomUserDetails(String username, String password, boolean enabled,
        boolean accountNonExpired, boolean credentialsNonExpired,
        boolean accountNonLocked,
        Collection<GrantedAuthority> authorities,
        long id, boolean loginBySms, Date lastPasswordModifiedDate,
        boolean fixedIp, String ip, String verificationCode)
    {
        super(username, password, enabled, accountNonExpired,
              credentialsNonExpired, accountNonLocked, authorities, id)
        this.loginBySms = loginBySms
        this.lastPasswordModifiedDate = lastPasswordModifiedDate
        this.fixedIp = fixedIp
        this.ip = ip
        this.verificationCode = verificationCode
    }
}
