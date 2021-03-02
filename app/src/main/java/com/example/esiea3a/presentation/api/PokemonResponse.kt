package com.example.esiea3a.presentation.api

import com.example.esiea3a.presentation.list.Pokemon


data class PokemonResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)