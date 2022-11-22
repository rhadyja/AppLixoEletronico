package com.example.appdescartelixoeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonZonaDaMata = findViewById(R.id.buttonZonaDaMata);
        Button buttonAgreste = findViewById(R.id.buttonAgreste);
        Button buttonRMR = findViewById(R.id.buttonRMR);

        buttonZonaDaMata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, ZonaDaMata.class);
                startActivity(intent1);
            }
        });

        buttonAgreste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Agreste.class);
                startActivity(intent2);
            }
        });

        buttonRMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, RegiaoMetropolitana.class);
                startActivity(intent3);
            }
        });
    }
}