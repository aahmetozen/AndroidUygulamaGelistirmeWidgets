package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
fun switchkullanimipreview(){
    switchkullanimi()
}

@Composable
fun switchkullanimi(){
    val switchdurum= remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Switch(checked = switchdurum.value,
            onCheckedChange ={
                switchdurum.value=it
                Log.e("switch secildi",it.toString())
            },
            colors = SwitchDefaults.colors(
                checkedTrackColor = Color.Red,
                checkedThumbColor = Color.Black,
                uncheckedTrackColor = Color.Green
            )
            )
        Button(onClick = {
            Log.e("switch en son durum",switchdurum.value.toString())
        }) {
            Text(text = "Goster")
        }
    }
}