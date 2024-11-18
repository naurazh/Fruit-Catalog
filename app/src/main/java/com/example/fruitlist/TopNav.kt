package com.example.fruitlist

import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNav(navController: NavController) {
    val currentRoute = navController.currentDestination?.route
    val title = if (currentRoute == "detail/") {
        "Detail Screen"
    } else if (currentRoute == "screenV") {
        "Screen A"
    } else if (currentRoute == "screenB") {
        "Screen B"
    } else if (currentRoute == "screenC") {
        "Screen C"
    } else {
        "Fruit Catalog App"
    }

    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        }
    )
}