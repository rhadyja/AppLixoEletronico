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

        WebView webview = findViewById(R.id.webViewAgreste);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        Bundle extras = getIntent().getExtras();//recebendo o link que vem da activity Agreste
        if(extras != null){
            String url = extras.getString("link"); //enetendendo a string que veio da activity Agreste
            webview.loadUrl(url); //abrindo o webview com o link vindo da activity Agreste
        }

    }
}