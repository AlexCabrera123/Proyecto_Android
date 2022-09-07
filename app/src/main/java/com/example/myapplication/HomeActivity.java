package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
private TextView tvTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvTest = findViewById(R.id.tvTest);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        int token=intent.getIntExtra("token",0);

        tvTest.setText(nombre + " - "+token);
    }
}