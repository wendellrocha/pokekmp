package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class GenerationVI(
    @SerialName("omegaruby-alphasapphire") val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphire?,
    @SerialName("x-y") val xY: Xy?

)