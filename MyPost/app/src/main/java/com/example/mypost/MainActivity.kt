package com.example.mypost

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.example.mypost.ui.theme.MyPostTheme
import com.example.mypost.ui.theme.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPostTheme {
                HomeScreen()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    var selectedTab by remember { mutableStateOf(0) }

    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("My Post") },
                backgroundColor = MaterialTheme.colors.secondary,
                contentColor = Color.White
            )
        },
        bottomBar = {
            BottomNavigation (
                backgroundColor = MaterialTheme.colors.secondary
            ) {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Usuários") },
                    label = { Text("Usuários") },
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0}
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.List, contentDescription = "Posts") },
                    label = { Text("Posts") },
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1}
                )
            }
        }
    ) {
        when (selectedTab) {
            0 -> UserScreen()
            1 -> PostScreen()
        }
    }
}