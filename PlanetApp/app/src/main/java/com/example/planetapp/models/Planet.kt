package com.example.planetapp.models

import com.example.planetapp.R

data class Planet(
    val id: Int,
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val planetList = listOf(
    Planet(
        id = 1,
        name = "Júpiter",
        type = "Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "778.5 milhões de km",
        diameter = "142,984 km",
        characteristics = "Maior planeta do Sistema Solar, possui grande mancha vermelha.",
        imageRes = R.drawable.jupiter,
        isFavorite = false
    ),
    Planet(
        id = 2,
        name = "Marte",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "227.9 milhões de km",
        diameter = "6,779 km",
        characteristics = "Conhecido como planeta vermelho, possui o maior vulcão do Sistema Solar.",
        imageRes = R.drawable.marte,
        isFavorite = false
    ),
    Planet(
        id = 3,
        name = "Mercúrio",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "57.9 milhões de km",
        diameter = "4,880 km",
        characteristics = "Planeta mais próximo do Sol, sem atmosfera significativa.",
        imageRes = R.drawable.mercurio,
        isFavorite = false
    ),
    Planet(
        id = 4,
        name = "Netuno",
        type = "Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "4.5 bilhões de km",
        diameter = "49,244 km",
        characteristics = "Conhecido por seus ventos extremamente rápidos.",
        imageRes = R.drawable.netuno,
        isFavorite = false
    ),
    Planet(
        id = 5,
        name = "Plutão",
        type = "Anão",
        galaxy = "Via Láctea",
        distanceFromSun = "5.9 bilhões de km",
        diameter = "2,377 km",
        characteristics = "Planeta anão localizado no cinturão de Kuiper.",
        imageRes = R.drawable.plutao,
        isFavorite = false
    ),
    Planet(
        id = 6,
        name = "Saturno",
        type = "Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "1.4 bilhões de km",
        diameter = "120,536 km",
        characteristics = "Famoso por seus anéis de gelo e poeira.",
        imageRes = R.drawable.saturno,
        isFavorite = false
    ),
    Planet(
        id = 7,
        name = "Terra",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "149.6 milhões de km",
        diameter = "12,742 km",
        characteristics = "Único planeta conhecido por abrigar vida.",
        imageRes = R.drawable.terra,
        isFavorite = false
    ),
    Planet(
        id = 8,
        name = "Urano",
        type = "Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "2.9 bilhões de km",
        diameter = "50,724 km",
        characteristics = "Rotação retrógrada, possui anéis tênues.",
        imageRes = R.drawable.urano,
        isFavorite = false
    ),
    Planet(
        id = 9,
        name = "Vênus",
        type = "Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "108.2 milhões de km",
        diameter = "12,104 km",
        characteristics = "Atmosfera densa e extremamente quente, com chuvas ácidas.",
        imageRes = R.drawable.venus,
        isFavorite = false
    )
)
