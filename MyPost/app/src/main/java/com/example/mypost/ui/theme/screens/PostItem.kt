package com.example.mypost.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mypost.data.models.Post

@Composable
fun PostItem(
    post: Post,
    onDelete: (Int) -> Unit,
    onEdit: (Post) -> Unit,
) {
    var showDialog by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 4.dp
    ) {
        Column (modifier = Modifier.padding(16.dp)) {
            Text(text = post.titulo, style = MaterialTheme.typography.h6)
            Spacer(Modifier.height(4.dp))

            Text(text = post.content, style = MaterialTheme.typography.body1)
            Spacer(Modifier.height(8.dp))

            Row {
                Button(
                    onClick = { showDialog = true },
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colors.error),
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "Deletar")
                }
                Button(onClick = { onEdit(post)}) {
                        Text(text = "Editar")
                }
            }
            if (showDialog) {
                AlertDialog(
                    onDismissRequest = { showDialog = false },
                    title = { Text(text = "Confirmar exclusão") },
                    text = { Text("Tem certeza que deseja deletar este post?") },
                    confirmButton = {
                        TextButton(onClick = {
                            onDelete(post.id)
                            showDialog = false
                        }) {
                            Text(text = "Sim")
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = {
                            showDialog = false
                        }) {
                            Text(text = "Cancelar")
                        }
                    }
                )
            }
        }
    }
}