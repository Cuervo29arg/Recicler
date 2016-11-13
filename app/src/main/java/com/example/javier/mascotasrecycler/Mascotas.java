package com.example.javier.mascotasrecycler;

/**
 * Created by Javier on 10/11/2016.
 */
public class Mascotas {

    //Variables de Mascotas
    private String nombre;
    private String raza;
    private int foto;

    //Constructor
    public Mascotas(String nombre,String raza,int foto){
        this.nombre=nombre;
        this.raza=raza;
        this.foto=foto;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getFoto() {
        return foto;
    }
    public void setFoto(int foto) {
        this.foto = foto;
    }
}
