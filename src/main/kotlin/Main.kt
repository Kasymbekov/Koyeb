import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    // Get the port from the environment variable (default to 8080)
    val port = System.getenv("PORT")?.toIntOrNull() ?: 8080

    // Start the Ktor server
    embeddedServer(Netty, port = port) {
        routing {
            get("/") {
                call.respondText("Hello, Koyeb!")
            }
        }
    }.start(wait = true)
}
