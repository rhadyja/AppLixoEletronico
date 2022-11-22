package com.example.appdescartelixoeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Agreste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreste);

            ListView listAgreste = findViewById(R.id.listAgreste);

            ArrayList<String> pontosDeDescarte = preencherDados();

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pontosDeDescarte);
            listAgreste.setAdapter(arrayAdapter);

            listAgreste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    if (position == 0) {
                        Intent intent1 = new Intent(Agreste.this, AgresteWebView.class);
                        startActivity(intent1);
                    } else if (position == 1) {
                        Intent intent2 = new Intent(Agreste.this, MainActivity.class);
                        startActivity(intent2);
                    } else {
                        Toast.makeText(Agreste.this, "Inválido", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        private ArrayList<String> preencherDados () {
            ArrayList<String> dados = new ArrayList<String>();
            dados.add("Caruaru");
            dados.add("Limoeiro");
            return dados;
        }
    }
