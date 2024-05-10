package com.example.demoGradle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoGradleApplication

fun main(args: Array<String>) {
	runApplication<DemoGradleApplication>(*args)
}
