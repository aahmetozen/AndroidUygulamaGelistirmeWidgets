package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun radiobuttonpreview(){
    radiobutton()
}

@Composable
fun radiobutton(){
    val secilenindex = remember { mutableStateOf(0)}
    val takimlistesi = listOf("Real Madrid","Barcelona")
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column {
            takimlistesi.forEachIndexed{indeks,takim-> Row(Modifier.clickable { secilenindex.value=indeks }) {
                RadioButton(selected = (takim == takimlistesi[secilenindex.value]),
                    onClick = {
                        secilenindex.value=indeks
                    })
                Text(text = takim)
            }}
        }

        Button(onClick = { Log.e("radio button en son durum",takimlistesi[secilenindex.value]) }) {
            Text(text = "Goster")
        }
    }
}