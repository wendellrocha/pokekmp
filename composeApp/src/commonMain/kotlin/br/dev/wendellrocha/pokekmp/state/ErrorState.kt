package br.dev.wendellrocha.pokekmp.state

class ErrorState(private val message: String): AbstractState() {
    fun getMessage(): String {
        return message
    }

    override fun toString(): String {
        return "ErrorState(message: ${message})"
    }
}