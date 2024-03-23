package com.example;

public class MainMaquinaB {
    public static void main(String[] args) {
        Gato gato = new Gato("Garfield");
        gato.maullar();
        System.out.println("El nombre del gato es " + gato.getNombre());
        System.out.println("El gato responde a Garfield? " + gato.respondeA("Garfield"));
        System.out.println("El gato responde a Gato? " + gato.respondeA("Gato"));

        Perro perro = new Perro("Cliford");
        perro.ladrar();
        System.out.println("El nombre del perro es " + perro.getNombre());
        System.out.println("El perro responde a Cliford? " + perro.respondeA("Cliford"));
        System.out.println("El perro responde a Carlos? " + perro.respondeA("Carlos"));

        //Maquina A        
        perro.ladrar();
        System.out.println("que hace chicho cuando se aburre ");
        perro.correr();
        System.out.println();
        System.out.println("que hace chicho cuando se emociona");
        perro.saltar();
        System.out.println();

        System.out.println("que hace chicho cuando se cansa");
        perro.caminar();
        System.out.println();

        //Maquina B
        gato.caminar();
        gato.correr();
        gato.saltar();
    }
}