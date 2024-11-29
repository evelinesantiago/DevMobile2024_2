package com.example.celebrityapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.celebrityapp.ui.screens.CelebrityScreen
import com.example.celebrityapp.ui.screens.HomeScreen
import com.example.celebrityapp.models.celebrityList

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen (onCelebritySelected = { celebrity ->
                navController.navigate("celebrity/${celebrity.name}")
            })
        }
        composable("celebrity/{celebrity}") { backStackEntry ->
            val celebrityName = backStackEntry.arguments?.getString("celebrity")
            val selectedCelebrity = celebrityList.first { it.name == celebrityName }
            CelebrityScreen(selectedCelebrity)
        }
    }
}