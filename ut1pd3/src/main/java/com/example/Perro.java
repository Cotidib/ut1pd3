package com.example;

public class Perro implements Mamifero {

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

    public void caminar() {
        System.out.println("por la vida camino, digo guau guau");
    }

    public void correr() {
        System.out.println("por la vida corro, digo guau guau");
    }

    public void saltar() {
        System.out.println("por la vida salto, digo guau guau");
    }
}
