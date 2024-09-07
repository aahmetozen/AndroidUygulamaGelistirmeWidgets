package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun buttonozellestirmepreview(){
    buttonozellestirme()
}

@Composable
fun buttonozellestirme(){
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
        Spacer(modifier = Modifier.size(30.dp))

        TextField(value = tf.value, onValueChange = {tf.value=it},
            label = { Text(text = "Veri giriniz",
                fontSize = 18.sp) })

        Button(onClick = {
            alinanveri.value=tf.value },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red),
            border = BorderStroke(2.dp,Color.Black),
            shape = RoundedCornerShape(50)
            ) {
            Text(text = "Veriyi al",
                fontSize = 20.sp)

        }
        OutlinedTextField(value = tfOutlined.value, onValueChange = {tfOutlined.value=it},
            label = { Text(text = "Veri giriniz",
                fontSize = 18.sp) })

        OutlinedButton(onClick = {
            alinanveri.value=tfOutlined.value },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red),
            border = BorderStroke(2.dp,Color.Black),
            shape = RoundedCornerShape(50)
            ) {
            Text(text = "Outlined Veriyi al",
                fontWeight = FontWeight.ExtraBold)

        }
    }

}