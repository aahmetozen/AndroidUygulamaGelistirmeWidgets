package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun progressindicatorpreview(){
    progressindicator()
}
@Composable
fun progressindicator(){
    val progressdurum = remember { mutableStateOf(false) }
    val takimlistesi = listOf("Real Madrid","Barcelona")
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

        Button(onClick = {}) {
            Text(text = "Goster")
        }
    }
}
