package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GenerationIII(
    @SerialName("emerald") var emerald: Emerald?,
    @SerialName("firered-leafgreen") var fireredLeafgreen: FireredLeafGreen?,
    @SerialName("ruby-sapphire") var rubySapphire: RubySapphire?

)