package com.example.appdescartelixoeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ZonaDaMataWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona_da_mata_web_view);

        WebView webview = findViewById(R.id.webViewZonaDaMata);

        webview.setWebViewClient(new WebViewClient());

        webview.loadUrl("https://www.google.com/maps/dir//Descarte+Eletr%C3%B4nicos+Caruaru+-+R.+17+-+Kennedy,+Caruaru+-+PE,+55036-720/@-8.2897645,-35.9746215,17z/data=!4m9!4m8!1m0!1m5!1m1!1s0x7a98bea1f58cec7:0xfcc9947fbeb599e3!2m2!1d-35.9724328!2d-8.2897645!3e0https://www.google.com/maps/dir//Descarte+Eletr%C3%B4nicos+Caruaru+-+R.+17+-+Kennedy,+Caruaru+-+PE,+55036-720/@-8.2897645,-35.9746215,17z/data=!4m9!4m8!1m0!1m5!1m1!1s0x7a98bea1f58cec7:0xfcc9947fbeb599e3!2m2!1d-35.9724328!2d-8.2897645!3e0");

    }
}