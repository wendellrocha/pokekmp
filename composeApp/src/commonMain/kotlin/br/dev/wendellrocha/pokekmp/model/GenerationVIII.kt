package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GenerationVIII(
    @SerialName("icons") val icons: Icons?

)