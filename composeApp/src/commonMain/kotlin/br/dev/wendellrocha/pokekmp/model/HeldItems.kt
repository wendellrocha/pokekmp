package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class HeldItems(
    @SerialName("item") val item: Item?,
    @SerialName("version_details") val versionDetails: ArrayList<VersionDetails>

)