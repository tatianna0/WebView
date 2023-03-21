package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    lateinit var mWebView : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mWebView = findViewById(R.id.webView)

        mWebView.settings.javaScriptEnabled = true
        mWebView.settings.builtInZoomControls = true
        mWebView.loadUrl("http://www.google.com")
    }
}