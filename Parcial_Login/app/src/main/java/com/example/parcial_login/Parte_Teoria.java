package com.example.parcial_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Parte_Teoria extends AppCompatActivity {

    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte_teoria);

        regresar = findViewById(R.id.regresar_button);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backto = new Intent(Parte_Teoria.this, MainActivity.class);
                startActivity(backto);
            }
        });

    }
}