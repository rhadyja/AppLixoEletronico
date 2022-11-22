package com.example.appdescartelixoeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RegiaoMetropolitanaWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiao_metropolitana_web_view);

        WebView webview = findViewById(R.id.webViewRMR);

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.google.com/maps/place/Cooperativa+de+Catadores+de+Materiais+Recicl%C3%A1veis+de+Paudalho+(COOPCAPA)/@-7.9189489,-35.1643079,17.25z/data=!4m13!1m7!3m6!1s0x7ab0a2bb8179129:0x2ef3298896b68c7a!2sPaudalho,+PE,+55825-000!3b1!8m2!3d-7.8990984!4d-35.1731826!3m4!1s0x7ab09b11f354255:0x6d606dae68eba315!8m2!3d-7.918935!4d-35.1645608");

    }
}