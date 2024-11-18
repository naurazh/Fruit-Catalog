package com.example.fruitlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ScreenB(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Detail Buah :",
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(16.dp)
                .padding(bottom = 16.dp) // Menambahkan jarak antara teks dan grid
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            items(DataBuah.buahList) { buah ->
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable { navController.navigate("detail/${buah.id}") }
                        .wrapContentSize(Alignment.Center)
                ) {
                    Image(
                        painter = painterResource(id = buah.gambar),
                        contentDescription = buah.nama,
                        modifier = Modifier.size(80.dp)
                    )
                    Text(text = buah.nama, textAlign = TextAlign.Center)
                }
            }
        }
    }
}

