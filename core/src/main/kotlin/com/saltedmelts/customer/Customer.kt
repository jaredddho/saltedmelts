package com.saltedmelts.customer

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.saltedmelts.core.ContactInfo
import org.apache.commons.lang3.builder.ToStringBuilder

data class Customer(
        @JsonIgnore
        val customerId: Int,
        @JsonProperty(value = "customer_id")
        val encryptedCustomerId: String,
        @JsonProperty(value = "first_name")
        val firstName: String,
        @JsonProperty(value = "last_name")
        val lastName: String
) {

    @JsonProperty(value = "contact")
    var contactInfo: ContactInfo? = null

    override fun toString(): String {
        return ToStringBuilder.reflectionToString(this)
    }
}
