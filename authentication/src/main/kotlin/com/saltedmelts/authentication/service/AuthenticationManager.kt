package com.saltedmelts.authentication.service

import org.slf4j.Logger
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class AuthenticationManager(
        private val logger: Logger
) {

    @PostConstruct
    fun init() {
        logger.info("Hello World")
    }
}