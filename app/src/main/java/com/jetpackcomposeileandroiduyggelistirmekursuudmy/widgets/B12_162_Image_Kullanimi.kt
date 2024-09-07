package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import android.annotation.SuppressLint
import android.app.Activity
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

// belirli bir kaynaktan alinan resimleri gosteren widget

@Preview
@Composable
fun imagekullanimipreview(){
    imagekullanimi()
}
@Composable
fun imagekullanimi(){
    Column {
        val activity = (LocalContext.current as Activity)
        Image(bitmap = ImageBitmap.imageResource(
            id = activity.resources.getIdentifier("yemekresim", "drawable",activity.packageName)),
            contentDescription = "resim")
        Image(painter = painterResource(id = R.drawable.resim),
            contentDescription = "ikon")
    }
}