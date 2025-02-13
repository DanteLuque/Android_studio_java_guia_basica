package com.ejercicio1.miprimeraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class J3_primer_ejercicio extends AppCompatActivity {

    private EditText tn1;
    private EditText tn2;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j3_primer_ejercicio);

        tn1 = (EditText) findViewById(R.id.txt_num1);
        tn2 = (EditText) findViewById(R.id.txt_num2);
        txtResult = (TextView) findViewById(R.id.txt_resultado);
    }

    //Metodo sumar
    public void sumar(View view){
        String valor1 = tn1.getText().toString();
        String valor2 = tn2.getText().toString();

        int suma = Integer.parseInt(valor1) + Integer.parseInt(valor2);

        String resultado = String.valueOf(suma);

        txtResult.setText(resultado);
    }
}