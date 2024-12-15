package com.example.nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.nighteventsapp.R

data class Event(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)

val eventList = listOf(
    Event(
        id = 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia.",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),
    Event(
        id = 2,
        title = "Workshop de Fotografia",
        description = "Descubra a arte de capturar momentos com nosso workshop completo de fotografia.",
        date = "2023-12-12",
        location = "Universidade",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id = 3,
        title = "Conferência de Negócios",
        description = "Para você que é empresário e deseja se aprofundar no mundo dos negócios.",
        date = "2024-08-17",
        location = "Centro de Eventos",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
    Event(
        id = 4,
        title = "Feira Gastrônomica",
        description = "Desperte seu gosto culinário e venha conhecer nosso evento.",
        date = "2024-12-10",
        location = "Beira-Mar",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),
    Event(
        id = 5,
        title = "Conferência Anual de Medicina",
        description = "Evento de grande relevância no âmbito da saúde, reunindo médico, pesquisadores, estudantes e profissionais da área.",
        date = "2023-10-22",
        location = "Havard",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img5
    ),
    Event(
        id = 6,
        title = "Feira de Livros",
        description = "Para amantes da literatura brasileira ou os demais genêros",
        date = "2022-04-12",
        location = "Biblioteca Estadual",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),
    Event(
        id = 7,
        title = "Encontro de Micro-Empresário",
        description = "Para você que busca alavancar a sua startup e busca um networkin sólido, esse é o lugar.",
        date = "2023-01-28",
        location = "Centro de Eventos",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img7
    ),
    Event(
        id = 8,
        title = "Soy Rebelde Tour",
        description = "Depois de 15 anos, diferentes caminhos, emoções e sentimentos em milhões de corações em todo o mundo enfim se reecontram.",
        date = "2023-11-19",
        location = "Allianz Parque",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img8
    ),
    Event(
        id = 9,
        title = "Exposição de Artes",
        description = "Venha prestigiar a exposições dos nossos artistas.",
        date = "2024-01-30",
        location = "Estação das Artes",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img9
    ),
    Event(
        id = 10,
        title = "Final da Liga dos Campeões.",
        description = "Grande final entre Real Madrid x Borussia Dortmund.",
        date = "2024-06-01",
        location = "Wembley-Londres",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img10
    ),
)
