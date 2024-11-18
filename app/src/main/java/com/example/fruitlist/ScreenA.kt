package com.example.fruitlist

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ScreenA(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        val currentRoute = navController.currentBackStackEntry?.destination?.route
        Log.d("ScreenA", "Current Route: $currentRoute")
        Text(
            text = "Daftar Nama Buah :",
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        LazyColumn {
            items(DataBuah.buahList) { buah ->
                Text(
                    text = buah.nama,
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable { navController.navigate("detail/${buah.id}") }
                )
            }
            item {
                Text(
                    text = "Gambar Buah :",
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                LazyRow(
                    modifier = Modifier.padding(bottom = 16.dp)
                ) {
                    items(DataBuah.buahList) { buah ->
                        Image(
                            painter = painterResource(id = buah.gambar),
                            contentDescription = buah.nama,
                            modifier = Modifier
                                .size(80.dp)
                                .padding(8.dp)
                                .clickable { navController.navigate("detail/${buah.id}")}
                        )
                    }
                }
            }
        }
    }
}
