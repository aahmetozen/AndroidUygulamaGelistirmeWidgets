package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets.sayi_tahmin_uygulamasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets.R
import kotlin.random.Random

@Composable
fun tahminekrani(navController: NavController){
    val tfTahmin= remember { mutableStateOf("") }
    val rastgelesayi= remember { mutableStateOf(0) }
    val kalanhak= remember { mutableStateOf(5) }
    val yonlendirme= remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        LaunchedEffect(key1 = true) { // sayfa acildigi anda 1 kere calisan fonksiyon
            rastgelesayi.value=Random.nextInt(51) // 0 ile 50 arasinda sayi uretecek
        }

        Text(text = "Kalan Hak: ${kalanhak.value}", fontSize = 36.sp, color = Color.Red)
        Text(text = "Yardim: ${yonlendirme.value}", fontSize = 24.sp, color = Color.Red)

        TextField(value = tfTahmin.value,
            onValueChange = {tfTahmin.value=it},
            label = { Text(text = "Tahmin")})

        Button(onClick = {
            kalanhak.value -=1
            val tahmin=tfTahmin.value.toInt()

            if (tahmin==rastgelesayi.value){
                navController.navigate("sonucekrani/true"){
                    popUpTo("tahminekrani"){inclusive=true} //backstack yapisi
                }
                return@Button
            }
            if (tahmin > rastgelesayi.value){
                yonlendirme.value="Azalt"
            }
            if (tahmin < rastgelesayi.value){
                yonlendirme.value="Arttir"
            }
            if (kalanhak.value==0){
                navController.navigate("sonucekrani/false"){
                    popUpTo("tahminekrani"){inclusive=true} }//backstack yapisi
            }

            tfTahmin.value=""



         },
            modifier = Modifier.size(250.dp,50.dp)) {
            Text(text = "TAHMIN ET")
        }
    }
}