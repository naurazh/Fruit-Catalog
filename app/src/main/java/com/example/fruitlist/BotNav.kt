package com.example.fruitlist

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomNav(navController: NavController) {
    NavigationBar {
        NavigationBarItem(
            selected = navController.currentDestination?.route == "screenA",
            onClick = { navController.navigate("screenA") },
            icon = { Icon(Icons.Default.List, contentDescription = "Screen A") },
            label = { Text("Home Screen") }
        )
        NavigationBarItem(
            selected = navController.currentDestination?.route == "screenB",
            onClick = { navController.navigate("screenB") },
            icon = { Icon(Icons.Default.GridView, contentDescription = "Screen B") },
            label = { Text("Detail") }
        )
        NavigationBarItem(
            selected = navController.currentDestination?.route == "screenC",
            onClick = { navController.navigate("screenC") },
            icon = { Icon(Icons.Default.Info, contentDescription = "Screen C") },
            label = { Text("About") }
        )
    }
}
