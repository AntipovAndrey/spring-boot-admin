package com.jetbrains.springadmin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringAdminApplication

fun main(args: Array<String>) {
    runApplication<SpringAdminApplication>(*args)
}
