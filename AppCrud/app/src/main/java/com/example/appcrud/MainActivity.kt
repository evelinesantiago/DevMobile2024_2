//package com.example.appcrud
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.os.PersistableBundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.viewModels
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Delete
//import androidx.compose.material.icons.filled.Edit
//import androidx.compose.material3.*
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.livedata.observeAsState
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//class MainActivity : ComponentActivity() {
//    private val viewModel: UserViewModel by viewModels()
//
//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState, persistentState)
//        setContent { UserApp(viewModel) }
//    }
//
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@SuppressLint("", "UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun UserApp(viewModel: UserViewModel) {
//    val usuarios by viewModel.users.observeAsState(emptyList())
//
//    var nome by remember { mutableStateOf("") }
//    var idade by remember { mutableStateOf("") }
//    var usuarioEditando by remember { mutableStateOf<User?>(null) }
//    var mensagemErro by remember { mutableStateOf<String?>(null) }
//
//    Scaffold (
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "Gerenciamento de Usuários") },
////                backgroundColor = MaterialTheme.colorScheme.primary,
////                contentColor = Color.White
//            )
//        }
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp))
//                    Text (
//                        if (usuarioEditando == null) "Adicionar novo usuário" else "Editar Usuário"),
//            fontWeight = FontWeight.Bold,
//            fontSize = 20.sp,
//            modifier = Modifier
//                .padding(bottom = 16.dp)
//        )
//
//        OutlinedTextField(
//            value = nome,
//            onValueChange = { nome = it },
//            label = { Text(text = "Nome") },
//            modifier = Modifier.fillMaxSize()
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = idade,
//            onValueChange = { idade = it },
//            label = { Text(text = "Idade") },
//            modifier = Modifier.fillMaxSize(),
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        Button(
//            onClick = {
//                try {
//                    if (nome.isNotEmpty() && idade.isNotEmpty()) {
//                        val idadeInt = idade.toInt()
//                        if (usuarioEditando == null) {
//                            viewModel.addUser(User(nome = nome, age = idadeInt))
//                        } else {
//                            viewModel.updateUser(
//                                usuarioEditando!!.copy(
//                                    nome = nome,
//                                    age = idadeInt
//                                )
//                            )
//                            usuarioEditando = null
//                        }
//                        nome = ""
//                        idade = ""
//                        mensagemErro = null
//                    }
//                } catch (e: NumberFormatException) {
//                    mensagemErro = "A idade deve ser um valor válido"
//                }
//            },
//                modifier = Modifier
//                    .align(Alignment.CenterHorizontally)
//            ) {
//                Text(text = if(usuarioEditando == null) "Adicionar usuário" else "Salvar alterações")
//            }
//            mensagemErro?.let {
//                Spacer(modifier = Modifier.height(8.dp))
//                Text(it, color = Color.Red, modifier = Modifier.align(Alignment.CenterHorizontally))
//            }
//            Spacer(modifier = Modifier.height(16.dp))
//            Divider(color = Color.Gray, thickness = 1.dp)
//
//            Text(
//                text = "Lista de Usuários",
//                fontWeight = FontWeight.Bold,
//                fontSize = 20.sp,
//                modifier = Modifier.padding(vertical = 16.dp)
//            )
//
//            LazyColumn {
//                items(usuarios) { usuario ->
//                    Row (
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 4.dp),
//                        verticalAligment = Alignment.CenterVertically
//                    ) {
//                        Column (
//                            modifier = Modifier
//                                .weight(1f)
//                        ) {
//                            Text(usuario.nome, fontWeight = FontWeight.Bold, fontSize = 18.sp)
//                            Text("Idade: ${usuario.age}", color = Color.Gray, fontSize = 14.sp)
//                        }
//                        IconButton(onClick = {
//                            nome = usuario.nome
//                            idade = usuario.age.toString()
//                            usuarioEditando = usuario
//                        }) {
//                            Icon(Icons.Default.Edit, contentDescription = "Editar usuário", tint = Color.Blue)
//                        }
//                        IconButton(onClick = {
//                            viewModel.deleteUser(usuario)
//                        }) {
//                            Icon(Icons.Default.Delete, contentDescription = "Excluir usuário", tint = Color.Red)
//                        }
//                    }
//                }
//            }
//        )
//    }
//}


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcrud.User
import com.example.appcrud.UserViewModel

// Atividade principal que inicializa o ViewModel e define o conteúdo da UI
class MainActivity : ComponentActivity() {
    private val viewModel: UserViewModel by viewModels() // Cria uma instância do ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { UserApp(viewModel) } // Define o conteúdo com a função composable
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter") // Supressão de warning relacionado ao Scaffold
@Composable
fun UserApp(viewModel: UserViewModel) {
    val usuarios by viewModel.users.observeAsState(emptyList()) // Observa a lista de usuários
    var nome by remember { mutableStateOf("") } // Estado para o nome do usuário
    var idade by remember { mutableStateOf("") } // Estado para a idade do usuário
    var usuarioEditando by remember { mutableStateOf<User?>(null) } // Estado para usuário em edição
    var mensagemErro by remember { mutableStateOf<String?>(null) } // Estado para mensagem de erro

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Gerenciamento de Usuários") },
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.White
            )
        }
    ) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

            // Cabeçalho do formulário
            Text(
                if (usuarioEditando == null) "Adicionar um Novo Usuário" else "Editar Usuário",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Campo para inserir o nome do usuário
            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Nome") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Campo para inserir a idade do usuário
            OutlinedTextField(
                value = idade,
                onValueChange = { idade = it },
                label = { Text("Idade") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Botão para adicionar ou salvar alterações
            Button(
                onClick = {
                    try {
                        if (nome.isNotEmpty() && idade.isNotEmpty()) {
                            val idadeInt = idade.toInt()
                            if (usuarioEditando == null) {
                                // Adiciona novo usuário
                                viewModel.addUser(User(nome = nome, age = idadeInt))
                            } else {
                                // Atualiza usuário existente
                                viewModel.updateUser(usuarioEditando!!.copy(nome = nome, age = idadeInt))
                                usuarioEditando = null
                            }
                            nome = ""
                            idade = ""
                            mensagemErro = null
                        }
                    } catch (e: NumberFormatException) {
                        mensagemErro = "A idade deve ser um número válido" // Mensagem de erro para idade inválida
                    }
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(if (usuarioEditando == null) "Adicionar Usuário" else "Salvar Alterações")
            }

            // Exibe a mensagem de erro, se houver
            mensagemErro?.let {
                Spacer(modifier = Modifier.height(8.dp))
                Text(it, color = Color.Red, modifier = Modifier.align(Alignment.CenterHorizontally))
            }

            Spacer(modifier = Modifier.height(16.dp))
            Divider(color = Color.Gray, thickness = 1.dp)

            // Lista de usuários
            Text(
                "Lista de Usuários",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            LazyColumn {
                items(usuarios) { usuario ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        elevation = 4.dp
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(usuario.nome, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                                Text("Idade: ${usuario.age}", color = Color.Gray, fontSize = 14.sp)
                            }
                            // Botão para editar o usuário
                            IconButton(onClick = {
                                nome = usuario.nome
                                idade = usuario.age.toString()
                                usuarioEditando = usuario
                            }) {
                                Icon(Icons.Default.Edit, contentDescription = "Editar Usuário", tint = Color.Blue)
                            }
                            // Botão para excluir o usuário
                            IconButton(onClick = { viewModel.deleteUser(usuario) }) {
                                Icon(Icons.Default.Delete, contentDescription = "Excluir Usuário", tint = Color.Red)
                            }
                        }
                    }
                }
            }
        }
    }
}