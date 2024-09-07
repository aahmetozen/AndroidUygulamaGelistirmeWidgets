package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
fun checkboxkullanimipreview(){
    checkboxkullanimi()
}

@Composable
fun checkboxkullanimi(){
    val checkboxdurum= remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Checkbox(checked = checkboxdurum.value,
                onCheckedChange = {
                    checkboxdurum.value=it
                    Log.e("checkbox secildi",it.toString())
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Red
                )
                )

            Text(text = "Jetpack Compose", modifier = Modifier.padding(top = 13.dp))
        }

        Button(onClick = {
            Log.e("checkbox en son durum",checkboxdurum.value.toString())
        }) {
            Text(text = "Goster")
        }
    }
}