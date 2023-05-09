package reposetories

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TunejarBackendApplication

fun main(args: Array<String>) {
    runApplication<TunejarBackendApplication>(*args)
}
