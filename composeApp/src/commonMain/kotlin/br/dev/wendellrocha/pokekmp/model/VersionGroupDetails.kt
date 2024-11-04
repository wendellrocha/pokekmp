package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class VersionGroupDetails(
    @SerialName("level_learned_at") val levelLearnedAt: Int?,
    @SerialName("move_learn_method") val moveLearnMethod: MoveLearnMethod?,
    @SerialName("version_group") val versionGroup: VersionGroup?

)