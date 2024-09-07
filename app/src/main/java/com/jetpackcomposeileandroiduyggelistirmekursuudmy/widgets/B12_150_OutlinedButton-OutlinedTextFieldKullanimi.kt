package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// aslinda textfiled ve button un gorsel olarak farkli gorunumudur.

@Preview
@Composable
fun outlinedbuttonoutlinedtextfieldkullanimipreview(){
    outlinedbuttonoutlinedtextfield()
}

@Composable
fun outlinedbuttonoutlinedtextfield(){
    val tf= remember { mutableStateOf("") }
    val tfOutlined= remember { mutableStateOf("") }
    val alinanveri= remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Gelen veri : ${alinanveri.value}")

        TextField(value = tf.value, onValueChange = {tf.value=it},
            label = { Text(text = "Veri giriniz") })

        Button(onClick = {
            alinanveri.value=tf.value
        }) {
            Text(text = "Veriyi al")

        }
        OutlinedTextField(value = tfOutlined.value, onValueChange = {tfOutlined.value=it},
            label = { Text(text = "Veri giriniz") })

        Button(onClick = {
            alinanveri.value=tfOutlined.value
        }) {
            Text(text = "Outlined Veriyi al")

        }
    }

}