package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GenerationII(
    @SerialName("crystal") var crystal: Crystal?,
    @SerialName("gold") var gold: Gold?,
    @SerialName("silver") var silver: Silver?

)