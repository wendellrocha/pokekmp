package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.Serializable

@Serializable
data class PokemonList(
    val name: String,
    val url: String
)
