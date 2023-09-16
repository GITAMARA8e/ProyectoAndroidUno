package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Costos, Hectareas;
    Button Calcular, Limpiar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Costos = findViewById(R.id.txtCostos);
        Hectareas = findViewById(R.id.txtHectareas);
        Calcular = findViewById(R.id.btnCalcular);
        Limpiar = findViewById(R.id.btnLimpiar);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ingresar_datos.class);

                int verdura = Integer.parseInt(Costos.getText().toString());
                int hectarea = Integer.parseInt(Hectareas.getText().toString());
                int total = verdura * hectarea;
                String multiplicacion = String.valueOf(total);
                intent.putExtra("resultado", multiplicacion.toString());
                startActivity(intent);
            }
        });

        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                int verdura = Integer.parseInt(Costos.getText().toString());
                int hectarea = Integer.parseInt(Hectareas.getText().toString());
                String Limpiar = " ";
                intent.putExtra("limpiar", Limpiar.toString());
                startActivity(intent);

            }
        });
    }
}





