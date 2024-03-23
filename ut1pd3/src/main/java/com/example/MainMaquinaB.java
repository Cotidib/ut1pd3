package com.example;

public class MainMaquinaB {
    public static void main(String[] args) {
        Gato gato = new Gato("Garfield");
        gato.maullar();
        System.out.println("El nombre del gato es " + gato.getNombre());
        System.out.println("El gato responde a gato? " + gato.respondeA("gato"));
    }
}