package com.jetpackcomposeileandroiduyggelistirmekursuudmy.widgets

import android.annotation.SuppressLint
import android.app.ActionBar.LayoutParams
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

//https://turk.net
// Webview yapisi sayesinde web siteleri uygulama icerisinde gosterebiliyoruz.
// manifest dosyasina <uses-permission android:name="android.permission.INTERNET"/> ekliyoruz
@Preview
@Composable
fun webviewkullanimipreview(){
    webviewkullanimi()
}
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun webviewkullanimi(){
    val url = "https://turk.net"
    AndroidView(factory = {
        WebView(it).apply {
            layoutParams = ViewGroup.LayoutParams(   // bu yapi sayesinde internet sitesinin
                ViewGroup.LayoutParams.MATCH_PARENT, // uygulamada yayilmasini sagladik
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            loadUrl(url)
        }
    },
        update = {it.loadUrl(url)})
}