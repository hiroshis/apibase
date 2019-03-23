package com.fujitsu.archmsa.apibase

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
class ApibaseApplication

fun main(args: Array<String>) {
	runApplication<ApibaseApplication>(*args)
}
