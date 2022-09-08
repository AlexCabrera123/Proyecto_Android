package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ListView lvLista;
    private ArrayList<String>alPaises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lvLista=findViewById(R.id.lvlista);
        alPaises=new ArrayList<String>();
        alPaises.add("Mexico");
        alPaises.add("Brazil");
        alPaises.add("Portugal");
        alPaises.add("Canada");
        alPaises.add("Japon");
        alPaises.add("Suecia");
        alPaises.add("Colombia");
        alPaises.add("China");
        alPaises.add("Francia");
        alPaises.add("Chile");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,alPaises);

        lvLista.setAdapter(adapter);

        lvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        int token = intent.getIntExtra("token",0);



    }
}