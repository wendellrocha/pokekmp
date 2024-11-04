package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Cries(
    @SerialName("latest") val latest: String?,
    @SerialName("legacy") val legacy: String?

)