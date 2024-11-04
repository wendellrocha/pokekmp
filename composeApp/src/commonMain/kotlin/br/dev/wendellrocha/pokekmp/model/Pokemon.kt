package br.dev.wendellrocha.pokekmp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Pokemon(
    @SerialName("abilities") val abilities: ArrayList<Abilities>,
    @SerialName("base_experience") val baseExperience: Int?,
    @SerialName("cries") val cries: Cries?,
    @SerialName("forms") val forms: ArrayList<Forms>,
    @SerialName("game_indices") val gameIndices: ArrayList<GameIndices>,
    @SerialName("height") val height: Int?,
    @SerialName("held_items") val heldItems: ArrayList<HeldItems>,
    @SerialName("id") val id: Int?,
    @SerialName("is_default") val isDefault: Boolean?,
    @SerialName("location_area_encounters") val locationAreaEncounters: String?,
    @SerialName("moves") val moves: ArrayList<Moves>,
    @SerialName("name") val name: String?,
    @SerialName("order") val order: Int?,
    @SerialName("past_abilities") val pastAbilities: ArrayList<String>,
    @SerialName("past_types") val pastTypes: ArrayList<String>,
    @SerialName("species") val species: Species?,
    @SerialName("sprites") val sprites: Sprites?,
    @SerialName("stats") val stats: ArrayList<Stats>,
    @SerialName("types") val types: ArrayList<Types>,
    @SerialName("weight") val weight: Int?

)