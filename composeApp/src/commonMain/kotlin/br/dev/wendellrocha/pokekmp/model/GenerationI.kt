package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GenerationI(
    @SerialName("red-blue") var redBlue: RedBlue?,
    @SerialName("yellow") var yellow: Yellow?

)