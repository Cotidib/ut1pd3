package com.example;

public class MainMaquinaA {

    private static Perro perro;
    public static void main(String[] args) {
        
        perro = new Perro("Cliford");

        System.out.println(perro.getNombre());
        perro.ladrar();
        System.out.println(perro.respondeA("Cliford"));
        System.out.println(perro.respondeA("carlos"));
        
    }
}