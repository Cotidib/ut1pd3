package com.example;

public class Gato implements Mamifero {

  private String nombre;

  public Gato (String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return this.nombre;
  }

  public void maullar(){
    System.out.println("miau");
  }

  public boolean respondeA(String unNombre){
    return false;
  }

  public void caminar(){
    System.out.println("caminando...");
  };

  public void correr(){
    System.out.println("corriendo...");
  };

  public void saltar(){
    System.out.println("saltar!");
  };
}