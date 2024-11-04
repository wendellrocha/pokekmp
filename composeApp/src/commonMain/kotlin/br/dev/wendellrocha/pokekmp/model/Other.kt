package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Other(
    @SerialName("dream_world") var dreamWorld: DreamWorld?,
    @SerialName("home") var home: Home?,
    @SerialName("official-artwork") var officialArtwork: OfficialArtwork?,
    @SerialName("showdown") val showdown: Showdown?

)