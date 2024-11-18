package com.example.fruitlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ScreenC() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Nama: Naurah Zhafira Harin",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
            )
            Text(
                text = "Email: naurahzharira@gmail.com",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.labelLarge
            )
            Text(
                text = "Asal Perguruan Negeri: Politeknik Negeri Batam",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.labelLarge
            )
            Text(
                text = "Jurusan: Teknik Informatika",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.labelLarge
            )
            Text(
                text = "Prodi:  Teknologi Rekayasa Perangkat Lunak",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.labelLarge
            )
        }
    }
}