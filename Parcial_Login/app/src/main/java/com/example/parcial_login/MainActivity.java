package com.example.parcial_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn_Ingresar;
    EditText usuario, contra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.User);
        contra = findViewById(R.id.password);
        btn_Ingresar = findViewById(R.id.Ingresar);

        btn_Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto1 = usuario.getText().toString();
                String texto2 = contra.getText().toString();

                /*if (!texto1.isEmpty() && !texto2.isEmpty() && texto1.equals("uac123") && texto2.equals("12345678")){
                    Intent entrar = new Intent(MainActivity.this, Parte_Teoria.class);
                    startActivity(entrar);
                }else {
                    Toast.makeText(MainActivity.this, "Por favor llenar los campos", Toast.LENGTH_LONG).show();
                }*/

                if (texto1.isEmpty() && texto2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Por favor llenar los campos", Toast.LENGTH_LONG).show();
                } else
                    if (texto1.equalsIgnoreCase("uac123") && texto2.equalsIgnoreCase("12345678")) {
                    Intent entrar = new Intent(MainActivity.this, Parte_Teoria.class);
                    startActivity(entrar);
                }else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}