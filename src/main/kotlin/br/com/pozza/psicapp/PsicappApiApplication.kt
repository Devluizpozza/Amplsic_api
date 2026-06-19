package br.com.pozza.psicapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PsicappApiApplication

fun main(args: Array<String>) {
	runApplication<PsicappApiApplication>(*args)
}
