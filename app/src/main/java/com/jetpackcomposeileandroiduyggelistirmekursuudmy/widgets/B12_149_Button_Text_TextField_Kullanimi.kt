package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun buttontexttextfieldkullanimipreview(){
    buttontexttextfieldkullanimi()
}

@Composable
fun buttontexttextfieldkullanimi(){
    val tf= remember { mutableStateOf("") }
    val alinanveri= remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Gelen veri : ${alinanveri.value}")
        
        TextField(value = tf.value, onValueChange = {tf.value=it},
            label = { Text(text = "Veri giriniz")})
        
        Button(onClick = { 
            alinanveri.value=tf.value
        }) {
            Text(text = "Veriyi al")
            
        }
    }

}