package com.example.javier.mascotasrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Javier on 10/11/2016.
 */
public class MascotasAdapter extends RecyclerView.Adapter<MascotasAdapter.MascotasViewHolder> {

    //Lista de mascotas
    ArrayList<Mascotas> mascotas;

    //Constructor
    public MascotasAdapter (ArrayList<Mascotas> mascotas){
        this.mascotas=mascotas;
    }

    ///Da vida al Card Layout
    @Override
    public MascotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Asociamos el layout a nuestra Recicler View (solo declaramos el View)
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotasViewHolder(v);
    }
    //Cada vez que se recorre la lista de contactos se ejecuta este elemento
    @Override
    public void onBindViewHolder(MascotasViewHolder mascotasViewHolder, int position) {
        //Se invoca de uno a uno
        Mascotas conMasc=mascotas.get(position);

        //Seteamos la foto del objeto que se da en la iteración
        mascotasViewHolder.imgFoto.setImageResource(conMasc.getFoto());
        mascotasViewHolder.tvNombre.setText(conMasc.getNombre());
        mascotasViewHolder.tvRaza.setText(conMasc.getRaza());

    }
    //Cantidad de elementos que contiene la lista
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    //Clase Estática
    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        //Defino todos los Views
        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvRaza;

        //Constructor de super clase
        public MascotasViewHolder(View itemView){
            super(itemView);

            //Voy a enlazar con los objetos
            imgFoto=(ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre=(TextView) itemView.findViewById(R.id.tvNombre);
            tvRaza=(TextView) itemView.findViewById(R.id.tvRaza);

        }
    }
}
