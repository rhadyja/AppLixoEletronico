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

public class RegiaoMetropolitana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiao_metropolitana);

        ListView listRMR = findViewById(R.id.listRMR);

        ArrayList<String> pontosDeDescarte = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pontosDeDescarte);
        listRMR.setAdapter(arrayAdapter);

        listRMR.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    Intent intent1 = new Intent(RegiaoMetropolitana.this, RegiaoMetropolitanaWebView.class);
                    startActivity(intent1);
                }
                else{
                    Toast.makeText(RegiaoMetropolitana.this, "Inválido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private ArrayList<String> preencherDados(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Recife");
        return dados;
    }
}