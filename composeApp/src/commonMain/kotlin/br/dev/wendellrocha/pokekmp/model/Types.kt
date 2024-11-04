package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Types(
    @SerialName("slot") var slot: Int?,
    @SerialName("type") var type: Type?

)