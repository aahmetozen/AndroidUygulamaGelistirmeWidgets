package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun clickablevegesturepreview(){
    clickablevegesture()
}

@Composable
fun clickablevegesture(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Red)
            //.clickable { Log.e("Box","tiklandi") }
            .pointerInput(Unit){
                detectTapGestures(
                    onTap = {
                        Log.e("Box","tiklandi")
                    },
                    onDoubleTap = {
                        println("cift tiklandi")
                    },
                    onLongPress = {Log.e("Box","uzerine uzun basildi")}
                )
            }
        )
    }
}