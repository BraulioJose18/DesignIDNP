package com.practica02.design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bienvenida extends AppCompatActivity {

    private Button iniciarSesion;
    private Button registrate;
    private Button usuarioAnonimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        iniciarSesion = (Button) findViewById(R.id.login);
        registrate = (Button) findViewById(R.id.registrate);
        usuarioAnonimo = (Button) findViewById(R.id.anonimo);

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIniciarSesion();
            }
        });
        registrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister();
            }
        });

    }
    public void openIniciarSesion(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openRegister(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}