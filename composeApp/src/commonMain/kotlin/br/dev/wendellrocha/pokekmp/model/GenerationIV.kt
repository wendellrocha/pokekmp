package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GenerationIV(
    @SerialName("diamond-pearl") val diamondPearl: DiamondPearl?,
    @SerialName("heartgold-soulsilver") val heartgoldSoulSilver: HeartGoldSoulSilver?,
    @SerialName("platinum") val platinum: Platinum?

)