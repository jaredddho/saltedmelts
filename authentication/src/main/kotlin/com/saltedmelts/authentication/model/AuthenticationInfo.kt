package com.saltedmelts.authentication.model

import com.fasterxml.jackson.annotation.JsonProperty

data class AuthenticationInfo(
        @JsonProperty(value = "access_token")
        val accessToken: String,
        @JsonProperty(value = "refresh_token")
        val refreshToken: String,
        @JsonProperty(value = "expires")
        val expires: Long
)