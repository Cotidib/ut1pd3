package com.example;

public class Perro {

    private String nombre;

    public Perro(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void ladrar(){
        System.out.println("guaf guaf");
    }

    public boolean respondeA(String unNombre){
        return this.nombre.equals(unNombre);
    }
}
