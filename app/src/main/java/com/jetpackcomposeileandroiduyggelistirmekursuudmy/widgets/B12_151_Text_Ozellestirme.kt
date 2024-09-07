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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun textozellestirmepreview(){
    textozellestirme()
}

@Composable
fun textozellestirme
            (){
    val tf= remember { mutableStateOf("") }
    val tfOutlined= remember { mutableStateOf("") }
    val alinanveri= remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Gelen veri : ${alinanveri.value}",
            color = Color.LightGray,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(background = Color.Blue)
        )

        TextField(value = tf.value, onValueChange = {tf.value=it},
            label = { Text(text = "Veri giriniz",
                fontSize = 18.sp) })

        Button(onClick = {
            alinanveri.value=tf.value
        }) {
            Text(text = "Veriyi al",
                fontSize = 20.sp,
                color = Color.White)

        }
        OutlinedTextField(value = tfOutlined.value, onValueChange = {tfOutlined.value=it},
            label = { Text(text = "Veri giriniz",
                fontSize = 18.sp) })

        Button(onClick = {
            alinanveri.value=tfOutlined.value
        }) {
            Text(text = "Outlined Veriyi al",
                fontWeight = FontWeight.ExtraBold)

        }
    }

}