package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Abilities(
    @SerialName("ability") val ability: Ability?,
    @SerialName("is_hidden") val isHidden: Boolean?,
    @SerialName("slot") val slot: Int?

)