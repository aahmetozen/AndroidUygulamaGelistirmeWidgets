package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets.R.drawable.*

// Floating action button: normal button gibi kullanilabilir ama genelde scaffold icinde
// kullanilir ve ekrana duyarli calisir yani sayfayi hareket ettirsek bile
// sayfada sabit kalir.

@Preview
@Composable
fun FAButtonkullanimipreview(){
    FAButtonkullanimi()
}


@Composable
fun FAButtonkullanimi(){
    Scaffold(floatingActionButton = {
        ExtendedFloatingActionButton(onClick = { },
            containerColor = Color.Red,
            contentColor = Color.White,
            content = {
                Text(text = "EKLE")
                Icon(painter = painterResource(id = R.drawable.ekle_resim),
                contentDescription = "")})



    })
    { paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues)){

        }

    }
}