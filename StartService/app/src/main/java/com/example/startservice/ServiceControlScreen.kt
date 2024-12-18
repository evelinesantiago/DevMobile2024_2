package com.example.startservice

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ServiceControlScreen(
    onStartClick: () -> Unit,
    onStopClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = onStartClick,
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Iniciar Serviço")
            }

            Button(
                onClick = onStopClick,
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Parar Serviço")
            }
        }
    }
}

@Composable
@Preview
fun ver() {
    ServiceControlScreen(
        onStartClick = {},
        onStopClick = {}
    )
}