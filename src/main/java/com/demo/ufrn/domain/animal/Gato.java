package com.demo.ufrn.domain.animal;

public class Gato extends Animal {

    public Gato(String name, int idade, String sexo) {
        super(name, idade, sexo);
    }

    public void dormir() {
        System.out.println("Dormindo...");
    }

    public void comer() {
        System.out.println("Comando whiska");
    }

    public void falar() {
        System.out.println("Meow meow");
    }
}
