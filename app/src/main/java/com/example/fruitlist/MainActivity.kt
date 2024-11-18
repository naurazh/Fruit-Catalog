package com.example.fruitlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FruitListApp()
        }
    }
}

@Composable
fun FruitListApp() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopNav(navController) },
        bottomBar = { BottomNav(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "screenA",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("screenA") { ScreenA(navController) }
            composable("screenB") { ScreenB(navController) }
            composable("screenC") { ScreenC() }
            composable("detail/{fruitId}") { backStackEntry ->
                val fruitId = backStackEntry.arguments?.getString("fruitId")?.toInt() ?: 0
                DetailBuah(fruitId)
            }
        }
    }
}