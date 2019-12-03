package de.laboranowitsch.apollon.uploadserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UploadserverApplication

fun main(args: Array<String>) {
    runApplication<UploadserverApplication>(*args)
}
