package com.example.nighteventsapp.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.*
import com.example.nighteventsapp.models.eventList

@Composable
fun EventDetailScreen(eventId: String?) {
    val event = eventList.find { it.id.toString() == eventId } // usa a lista atualizada
    event?.let {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column (
                modifier = Modifier.padding(16.dp)
            ) {
                Image( // exibe imagem do evento
                    painter = painterResource(id = it.imageRes),
                    contentDescription = "Imagem do evento",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))

                // exibe o titulo do evento
                Text(
                    text = it.title,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.height(8.dp))

                // exibe a descrição do evento
                Text(
                    text = it.description,
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(16.dp))

                // exibe a data e a localização do evento
                Text(
                    text = "Data: ${it.date}",
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "Local: ${it.location}",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    } ?: run {
        // exibe uma mensagem se o evento não for encontrado
        Text(
            text = "Evento não encontrado",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}