package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.Serializable

@Serializable
data class Response<T>(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val results: List<T>
)
