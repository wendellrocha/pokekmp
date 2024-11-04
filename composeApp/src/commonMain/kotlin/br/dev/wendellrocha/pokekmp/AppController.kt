package br.dev.wendellrocha.pokekmp

import br.dev.wendellrocha.pokekmp.http.ClientHttp
import br.dev.wendellrocha.pokekmp.model.PokemonList
import br.dev.wendellrocha.pokekmp.model.Response
import br.dev.wendellrocha.pokekmp.state.AbstractState
import br.dev.wendellrocha.pokekmp.state.ErrorState
import br.dev.wendellrocha.pokekmp.state.InitialState
import br.dev.wendellrocha.pokekmp.state.LoadedState
import br.dev.wendellrocha.pokekmp.state.LoadingState
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppController {
    private val _state: MutableStateFlow<AbstractState> = MutableStateFlow(InitialState)
    val state = _state.asStateFlow()

    suspend fun fetchPokemons(limit: Int = 1000, offset: Int = 0) {
        try {
            _state.value = LoadingState
            val result = ClientHttp.client.get("pokemon?limit=${limit}&$offset=${offset}")
            val body: Response<PokemonList> = result.body();
            _state.value = LoadedState(body.results)

        } catch (e: Exception) {
            _state.value = ErrorState(e.message.toString())
        }
    }
}