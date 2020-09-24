package com.saltedmelts.authentication.model

import com.fasterxml.jackson.annotation.JsonProperty

data class LoginInfo(
        @JsonProperty(value = "email")
        val email: String,
        @JsonProperty(value = "password")
        val password: String,
        @JsonProperty(value = "type")
        val loginType: LoginType
)