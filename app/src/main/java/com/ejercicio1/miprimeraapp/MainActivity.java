package com.ejercicio1.miprimeraapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        // La actividad está creada

        float promedio = 0, materiaA = 10, materiaB = 9, materiaC = 10;

        promedio = (materiaA+materiaB+materiaC)/3;

        if(promedio>=11){
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        }else if(promedio<=10){
            Toast.makeText(this, "Jalado", Toast.LENGTH_SHORT).show();
        }

    }


}