package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Stats(
    @SerialName("base_stat") val baseStat: Int?,
    @SerialName("effort") val effort: Int?,
    @SerialName("stat") val stat: Stat?

)