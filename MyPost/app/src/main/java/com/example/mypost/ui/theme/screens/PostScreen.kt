package com.example.mypost.ui.theme.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.foundation.lazy.items
//import androidx.compose.material.AlertDialog
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.TextButton
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mypost.data.models.Post
import com.example.mypost.viewmodel.PostViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostScreen(viewModel: PostViewModel = viewModel()) {
    var titulo by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
    var editingPost by remember { mutableStateOf<Post?>(null) }
    val context = LocalContext.current

    LaunchedEffect (Unit) {
        isLoading = true
        viewModel.fetchPost()
        isLoading = false
    }

    Column (modifier = Modifier.padding(16.dp)) {
        TextField(
            value = titulo,
            onValueChange = { titulo = it },
            label = { Text(text = "Título") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.LightGray,
                focusedLabelColor = MaterialTheme.colorScheme.primary,
                unfocusedLabelColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = content,
            onValueChange = { content = it },
            label = { Text(text = "Conteúdo") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.LightGray,
                focusedLabelColor = MaterialTheme.colorScheme.primary,
                unfocusedLabelColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                isLoading = true
                viewModel.createPost(titulo, content, onSuccess = {
                    Toast.makeText(context, "Post Criado com sucesso", Toast.LENGTH_SHORT).show()
                    isLoading = false
                }, onError = {
                    Toast.makeText(context, "Erro ao criar o post", Toast.LENGTH_SHORT).show()
                    isLoading = false
                })
                titulo = ""
                content = ""
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF018786),
                contentColor = Color.White
            )
        ) {
            Text(text = "Criar Post")
        }

        Spacer(modifier = Modifier.height(8.dp))
        if (isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        } else {
            LazyColumn {
                items(viewModel.posts) { post ->
                    PostItem(
                        post = post,
                        onDelete = { viewModel.deletePost(it) },
                        onEdit = { editingPost = it }
                    )
                }
            }
        }

        if (editingPost != null) {
            AlertDialog(
                onDismissRequest = { editingPost = null },
                title = { Text(text = "Editar post") },
                text = {
                    Column {
                        TextField(
                            value = editingPost!!.titulo,
                            onValueChange = { newTitle -> editingPost = editingPost!!.copy(titulo = newTitle)},
                            label = { Text(text = "Título") },
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        TextField(
                            value = editingPost!!.content,
                            onValueChange = { newContent -> editingPost = editingPost!!.copy(content = newContent)},
                            label = { Text(text = "Conteúdo") }
                        )

                        Spacer(modifier = Modifier.height(8.dp))
                    }
                },
                confirmButton = {
                    TextButton(onClick = {
                        viewModel.updatePost(
                            editingPost!!.id,
                            editingPost!!.titulo,
                            editingPost!!.content
                        )
                        editingPost = null
                    }) {
                        Text(text = "Salvar")
                    }
                },
                dismissButton = {
                    TextButton(onClick = {
                        editingPost = null
                    }) {
                    Text(text = "Cancelar")
                    }
                }
            )
        }
    }
}