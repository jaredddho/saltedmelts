package com.saltedmelts.authentication.service

import com.saltedmelts.authentication.model.AuthenticationInfo
import com.saltedmelts.authentication.model.LoginInfo
import com.saltedmelts.authentication.model.LoginType.CUSTOMER
import com.saltedmelts.authentication.model.LoginType.PARTNER
import org.slf4j.Logger
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
        value = ["/auth"],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
)
class AuthenticationController(
        private val logger: Logger,
        private val authenticationManager: AuthenticationManager
) {

    @RequestMapping(
            value = ["/login"],
            method = [RequestMethod.POST]
    )
    fun login(@RequestBody loginInfo: LoginInfo): AuthenticationInfo {
        return when (loginInfo.loginType) {
            CUSTOMER -> AuthenticationInfo("", "", 0)
            PARTNER -> AuthenticationInfo("", "", 0)
        }
    }
}