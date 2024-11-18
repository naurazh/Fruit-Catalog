package com.example.fruitlist

import androidx.annotation.DrawableRes

data class Buah(
    val id: Int,
    val nama: String,
    @DrawableRes val gambar: Int
)

object DataBuah {
    val buahList = listOf(
        Buah(1, "Apel", R.drawable.apel),
        Buah(2, "Jeruk", R.drawable.jeruk),
        Buah(3, "Mangga", R.drawable.mangga),
        Buah(4, "Pisang", R.drawable.pisang),
        Buah(5, "Anggur", R.drawable.anggur),
        Buah(6, "Semangka", R.drawable.semangka),
        Buah(7, "Kiwi", R.drawable.kiwi),
        Buah(8, "Pir", R.drawable.pir),
        Buah(9, "Stroberi", R.drawable.strawberry),
        Buah(10, "Kelapa", R.drawable.kelapa),
        Buah(11, "Lemon", R.drawable.lemon),
        Buah(12, "Cherry", R.drawable.cherry)
    )
}
