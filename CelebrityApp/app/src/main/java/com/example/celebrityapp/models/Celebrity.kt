package com.example.celebrityapp.models

import com.example.celebrityapp.R

data class Celebrity (
    val id: Int,
    val name: String,
    val age: Int,
    val imageRes: Int,
    val description: String,
    val curiosities: List<String>,
)

val celebrityList = listOf(
    Celebrity (
        id = 1,
        name = "Neymar Jr",
        age = 32,
        imageRes = R.drawable.neymar,
        description ="Jogador de futebol, considerado um dos melhores do mundo.",
        curiosities = listOf("Já jogou pelo Santos, Barcelona e PSG.", "Adora videogames e streaming.")
    ),
    Celebrity(
        id = 2,
        name= "Bruna Marquezine",
        age = 29,
        imageRes = R.drawable.bruna,
        description = "Atriz brasileira com uma carreira internacional crescente.",
        curiosities = listOf("Foi protagonista em várias novelas globais.", "Atuou no filme 'Besouro Azul' da DC.")
    ),
    Celebrity(
        id = 3,
        name = "Cristiano Ronaldo",
        age = 39,
        imageRes = R.drawable.cr7,
        description = "Jogador de futebol português, ícone mundial do esporte.",
        curiosities = listOf("Já jogou pelo Manchester United, Real Madrid e Juventus.", "É um dos atletas mais seguidos nas redes sociais.")
    ),
    Celebrity(
        id = 4,
        name = "Robert Downey Jr.",
        age = 59,
        imageRes = R.drawable.robert,
        description = "Ator renomado, famoso por seu papel como Tony Stark/Iron Man.",
        curiosities = listOf("Superou problemas pessoais para se tornar um dos atores mais bem pagos.", "Apaixonado por tecnologia e sustentabilidade.")
    ),
    Celebrity(
        id = 5,
        name = "Chris Evans",
        age = 43,
        imageRes = R.drawable.evans,
        description = "Ator conhecido por interpretar o Capitão América.",
        curiosities = listOf("Também dirigiu filmes.", "É conhecido por sua simpatia com fãs.")
    ),
    Celebrity(
        id = 6,
        name = "Zendaya",
        age = 28,
        imageRes = R.drawable.zendaya,
        description = "Atriz e cantora, famosa por seu papel em 'Euphoria'.",
        curiosities = listOf("Ganhou prêmios importantes como o Emmy.", "Também atua como produtora.")
    ),
    Celebrity(
        id = 7,
        name = "Chris Hemsworth",
        age = 41,
        imageRes = R.drawable.cris,
        description = "Ator australiano que interpreta Thor nos filmes da Marvel.",
        curiosities = listOf("É apaixonado por fitness e saúde.", "Fez sucesso em Hollywood após atuar em séries australianas.")
    ),
    Celebrity(
        id = 8,
        name = "Elizabeth Olsen",
        age = 35,
        imageRes = R.drawable.elizabeth,
        description = "Atriz conhecida por seu papel como Wanda Maximoff/Feiticeira Escarlate.",
        curiosities = listOf("É irmã mais nova das gêmeas Olsen.", "Estudou atuação na Tisch School of the Arts.")
    ),
    Celebrity(
        id = 9,
        name = "Scarlett Johansson",
        age = 40,
        imageRes = R.drawable.scarlett,
        description = "Atriz e cantora, conhecida por papéis como Viúva Negra.",
        curiosities = listOf("Uma das atrizes mais bem pagas do mundo.", "Já foi indicada ao Oscar duas vezes no mesmo ano.")
    ),
    Celebrity(
        id = 10,
        name = "Anne Hathaway",
        age = 41,
        imageRes = R.drawable.anne,
        description = "Atriz vencedora do Oscar por 'Os Miseráveis'.",
        curiosities = listOf("Estreou no cinema com 'O Diário da Princesa'.", "É ativista por direitos das mulheres.")
    ),
    Celebrity(
        id = 11,
        name = "Emma Watson",
        age = 34,
        imageRes = R.drawable.emma,
        description = "Atriz e ativista, conhecida por seu papel como Hermione Granger.",
        curiosities = listOf("É embaixadora da ONU Mulheres.", "Formada em Literatura Inglesa por Brown.")
    ),
    Celebrity(
        id = 12,
        name = "Daniel Radcliffe",
        age = 35,
        imageRes = R.drawable.daniel,
        description = "Ator conhecido mundialmente por interpretar Harry Potter.",
        curiosities = listOf("Tem explorado papéis diversificados no teatro e cinema.", "É fã de literatura e de poesia.")
    ),
)





