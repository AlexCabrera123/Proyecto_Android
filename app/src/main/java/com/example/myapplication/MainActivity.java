package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.Clases.Circulo;
import com.example.myapplication.Clases.Triangulo;

public class MainActivity extends AppCompatActivity {

    private TextView tvFibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Triangulo tri1 = new Triangulo( 12, 15,"Azul");
        Triangulo tri2 = new Triangulo(15.5, 24, "Amarillo");

        Circulo cir1 = new Circulo(5, 3.1416,"Azul");
        Circulo cir2 = new Circulo(6,3.1416,"Rojo");

        tri1.setColor("Negro");

        System.out.println( tri1.getColor());

        tvFibo = findViewById(R.id.tvFibonacci);
        tvFibo.setText("El àrea del circulo "+cir1.getColor()+" es"+cir1.calcularAreaCirculo());


    }
}