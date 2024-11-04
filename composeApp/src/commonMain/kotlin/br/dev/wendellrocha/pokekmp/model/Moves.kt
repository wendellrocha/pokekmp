package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Moves(
    @SerialName("move") val move: Move?,
    @SerialName("version_group_details") val versionGroupDetails: ArrayList<VersionGroupDetails>

)