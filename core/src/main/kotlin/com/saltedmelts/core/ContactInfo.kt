package com.saltedmelts.core

import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.ToStringBuilder

data class ContactInfo(
        @JsonProperty(value = "email")
        var email: String,
        @JsonProperty(value = "country_code")
        var countryCode: String,
        @JsonProperty(value = "mobile_phone")
        var mobilePhone: String
) {
    override fun toString(): String {
        return ToStringBuilder.reflectionToString(this)
    }
}
