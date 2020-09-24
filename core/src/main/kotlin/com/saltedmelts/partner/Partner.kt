package com.saltedmelts.partner

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.ToStringBuilder

data class Partner(
        @JsonIgnore
        val partnerId: Int,
        @JsonProperty(value = "partner_id")
        val encryptedPartnerId: String,
        @JsonProperty(value = "business_name")
        val businessName: String
) {
    override fun toString(): String {
        return ToStringBuilder.reflectionToString(this)
    }
}
