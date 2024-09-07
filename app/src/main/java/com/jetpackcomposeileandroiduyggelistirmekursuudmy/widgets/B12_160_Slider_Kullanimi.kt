package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun sliderkullanimipreview(){
    sliderkullanimi()
}

@Composable
fun sliderkullanimi(){
    val progressdurum = remember { mutableStateOf(false) }
    val sliderdeger = remember { mutableStateOf(0f) } // slider ondalikli sonuc verir

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        if (progressdurum.value){
            CircularProgressIndicator(color = Color.Red)
        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = {progressdurum.value=true}) {
                Text(text = "Basla")
            }
            Button(onClick = {progressdurum.value=false}) {
                Text(text = "Dur")
            }
        }
        
        Text(text = "Sonuc: ${sliderdeger.value.toInt()}")

        Slider(value = sliderdeger.value,
            onValueChange = {sliderdeger.value=it},
            valueRange = 0f..100f,
            modifier = Modifier.padding(all = 20.dp),
            colors = SliderDefaults.colors(
                thumbColor = Color.Red,
                activeTrackColor = Color.Blue,
                inactiveTrackColor = Color.Gray
            ))

        Button(onClick = {}) {
            Text(text = "Goster")
        }
    }
}