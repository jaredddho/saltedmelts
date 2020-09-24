package com.saltedmelts.authentication.model

import com.fasterxml.jackson.annotation.JsonProperty

enum class LoginType {
    @JsonProperty(value = "customer")
    CUSTOMER,
    @JsonProperty(value = "partner")
    PARTNER
}