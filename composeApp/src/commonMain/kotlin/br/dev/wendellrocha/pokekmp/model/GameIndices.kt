package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GameIndices(
    @SerialName("game_index") val gameIndex: Int?,
    @SerialName("version") val version: Version?

)