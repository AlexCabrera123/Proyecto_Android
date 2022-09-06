package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Clases.Circulo;
import com.example.myapplication.Clases.Triangulo;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button bIngresar;
    private TextView tvPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        bIngresar=findViewById(R.id.bIngresar);
        tvPrueba = findViewById(R.id.tvPrueba);


        bIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



               String email = etEmail.getText().toString().trim();
               String password = etPassword.getText().toString().trim();

                if(email.equals(" ")||password.equals(" "))
                    Toast.makeText(getApplicationContext(),"FAVOR DE INGRESAR SU EMAIL Y CONTRASEÑA",Toast.LENGTH_LONG);
                else
                    Toast.makeText(getApplicationContext(),email+" - "+password, Toast.LENGTH_LONG);



            }
        });

    }
}