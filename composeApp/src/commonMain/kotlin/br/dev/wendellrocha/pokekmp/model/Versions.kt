package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Versions(
    @SerialName("generation-i") val generationI: GenerationI?,
    @SerialName("generation-ii") val generationII: GenerationII?,
    @SerialName("generation-iii") val generationIII: GenerationIII?,
    @SerialName("generation-iv") val generationIV: GenerationIV?,
    @SerialName("generation-v") val generationV: GenerationV?,
    @SerialName("generation-vi") val generationVI: GenerationVI?,
    @SerialName("generation-vii") val generationVII: GenerationVII?,
    @SerialName("generation-viii") val generationVIII: GenerationVIII?,

    )