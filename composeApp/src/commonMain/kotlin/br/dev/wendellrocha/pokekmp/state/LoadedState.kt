package br.dev.wendellrocha.pokekmp.state

class LoadedState<T>(private val content: T): AbstractState() {
    fun getContent(): T {
        return content;
    }

    override fun toString(): String {
        return "LoadedState(content: $content)"
    }

    override fun hashCode(): Int {
        return content.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LoadedState<*>

        return content == other.content
    }
}