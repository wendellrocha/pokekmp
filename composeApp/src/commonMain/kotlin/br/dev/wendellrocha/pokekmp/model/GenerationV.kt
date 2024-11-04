package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class GenerationV(
    @SerialName("black-white") val blackWhite: BlackWhite?

)