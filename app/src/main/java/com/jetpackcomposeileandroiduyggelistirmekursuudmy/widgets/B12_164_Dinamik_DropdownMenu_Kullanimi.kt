package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun dinamikdropdownmenupreview(){
    dinamikdropdownmenu()
}
@Composable
fun dinamikdropdownmenu(){
    val ulkeliste= listOf("Turkiye","italya","almanya","japonya","rusya","cin")
    val aciliskontrol = remember { mutableStateOf(false) }
    val secilenindeks = remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box {
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .clickable {
                        aciliskontrol.value = true
                    }
            ) {
                Text(text = ulkeliste[secilenindeks.value])
                Image(painter = painterResource(id = R.drawable.dropdownmenu_resim), contentDescription = "")
            }
            DropdownMenu(
                expanded = aciliskontrol.value,
                onDismissRequest = { aciliskontrol.value=false }) {

                ulkeliste.forEachIndexed{indeks,ulke->
                    DropdownMenuItem(
                        { Text(text = ulke) },
                        onClick = {aciliskontrol.value=false
                        secilenindeks.value=indeks})

                }


            }
        }
        Button(onClick = {

        }) {
            Text(text = "Goster")}
    }
}