package com.example.nighteventsapp.ui.components

import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.*

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar {
        // lista de itens com rotas, rótulos e ícones
        val items = listOf(
            Triple("home", "Home", Icons.Default.Home),
            Triple("events", "Inscritos", Icons.Default.Event),
            Triple("favorites", "Favoritos", Icons.Default.Favorite)
        )
        items.forEach { (route, label, icon) ->
            NavigationBarItem(
                icon = { Icon(icon, contentDescription = label) }, // icone especifico para cada item
                label = { Text(label) },
                selected = false, // atualiza a lógica de seleção, se necessário
                onClick = { navController.navigate(route) }
            )
        }
    }
}