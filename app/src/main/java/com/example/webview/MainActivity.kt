package com.example.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    lateinit var webView : WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         webView = findViewById<WebView>(R.id.wb_webView) as WebView
        webView.loadUrl("https://www.google.com")
        webView.settings.javaScriptEnabled=(true)

        webView.webViewClient= WebViewClient()
        webView.settings.setSupportZoom(true)

    }

}