package com.example.nighteventsapp.ui.components

import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@ExperimentalMaterial3Api
@Composable
fun TopBar(
    onThemeToggle: () -> Unit,
    onOpenDrawer: () -> Unit
) {
    TopAppBar(
        title = { Text("EventsApp") },
        navigationIcon = {
            IconButton(onClick = onOpenDrawer) { // abri o menu ao clicar no icone
                Icon(Icons.Default.Menu, contentDescription = "Open Menu")
            }
        },
        actions = {
            IconButton(onClick = onThemeToggle) {
                Icon(Icons.Default.BrightnessHigh, contentDescription = "Toggle Theme")
            }
        }
    )
}