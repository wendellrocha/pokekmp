package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Move(
    @SerialName("name") val name: String?,
    @SerialName("url") val url: String?

)