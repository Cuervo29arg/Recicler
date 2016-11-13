package com.example.javier.mascotasrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaDeMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar miActionBar=(Toolbar) findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);

        listaDeMascotas=(RecyclerView)findViewById(R.id.rvContactos);

        LinearLayoutManager lnm=new LinearLayoutManager(this);
        lnm.setOrientation(LinearLayoutManager.VERTICAL); //Cards una debajo de otra

        listaDeMascotas.setLayoutManager(lnm);
        inicializarListaDeContactos();
        inicializarAdaptador();
    }
    public void inicializarAdaptador(){
        MascotasAdapter adaptador=new MascotasAdapter(mascotas);
        listaDeMascotas.setAdapter(adaptador);
    }
    public void inicializarListaDeContactos(){
        ArrayList<String> nombresContacto= new ArrayList<>();
        mascotas=new ArrayList<Mascotas>();
        //Creamos contactos Hardcodeados (pueden ser de un web services o BD
        mascotas.add(new Mascotas("FIDO","CALLE",R.drawable.cucha));
        mascotas.add(new Mascotas("ROCKO","PITBULL",R.drawable.canil));
        mascotas.add(new Mascotas("KIM","SHITZU",R.drawable.balanceado));
        mascotas.add(new Mascotas("TIBURONCIN","PEZ DORADO",R.drawable.gato));
        mascotas.add(new Mascotas("NEMO","PEZ GLOBO",R.drawable.pez));
        mascotas.add(new Mascotas("DARWIN","DESCONOCIDO",R.drawable.pescado));
        mascotas.add(new Mascotas("TOBIDAS","COQUER",R.drawable.perro));
    }
}
