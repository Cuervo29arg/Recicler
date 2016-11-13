package com.example.javier.mascotasrecycler;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Javier on 12/11/2016.
 */
public class MascotasDetalle extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvRaza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        //Recibo los parámetros
        Bundle parametros = getIntent().getExtras();

        //Recupero datos
        String nombre = parametros.getString(getResources().getString(R.string.pNombre));
        String raza = parametros.getString(getResources().getString(R.string.pTelefono));

        //Creo los textview
        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvRaza = (TextView) findViewById(R.id.tvTelefono);

        //Les asigno lo que recuperé de los datos
        tvNombre.setText(nombre);
        tvRaza.setText(raza);
    }
}
