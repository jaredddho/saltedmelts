package com.saltedmelts.partner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class PartnerApplication

fun main(args: Array<String>) {
	runApplication<PartnerApplication>(*args)
}
