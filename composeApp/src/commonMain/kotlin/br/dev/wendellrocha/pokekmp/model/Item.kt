package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Item(

    @SerialName("name") val name: String?,
    @SerialName("url") val url: String?

)