package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class VersionDetails(
    @SerialName("rarity") val rarity: Int?,
    @SerialName("version") val version: Version?

)