package com.example.appdescartelixoeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AgresteWebView extends AppCompatActivity {

    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreste_web_view);

        webView(getUrl());
    }

    public String getUrl() {
        return url;
    }

    public void setLink(String url) {
        this.url = url;
    }

    public void webView(String url){
        WebView webview = findViewById(R.id.webViewAgreste);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);
    }
}