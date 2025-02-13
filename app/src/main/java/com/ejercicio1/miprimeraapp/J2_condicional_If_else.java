package com.ejercicio1.miprimeraapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;


public class J2_condicional_If_else extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_j2_condicional_if_else);
        // La actividad está creada

        float promedio, materiaA = 15, materiaB = 15, materiaC = 13;

        promedio = (materiaA+materiaB+materiaC)/3;

        if(promedio>=11){
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        }else if(promedio<=10){
            Toast.makeText(this, "Jalado", Toast.LENGTH_SHORT).show();
        }

    }


}