@file:Suppress("UNUSED_EXPRESSION")

package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// bu yapi sayesinde sayfa uzerinde bir nesneye tiklayarak menu acabiliriz

@Composable
@Preview
fun dropdownmenupreview(){
    dropdownmenu()
}
@Composable
fun dropdownmenu(){
    val dropdownmenukontrol= remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box {
            Button(onClick = {
                dropdownmenukontrol.value=true
            }) {
                Text(text = "Goster")
            }
            DropdownMenu(
                expanded = dropdownmenukontrol.value,
                onDismissRequest = { dropdownmenukontrol.value=false }) {

                DropdownMenuItem(
                    {Text(text = "sil")},
                    onClick = {dropdownmenukontrol.value=false})

                DropdownMenuItem(
                    {Text(text = "guncelle")},
                    onClick = {dropdownmenukontrol.value=false})

            }
        }
    }
}