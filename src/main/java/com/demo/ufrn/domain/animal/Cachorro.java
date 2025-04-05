package com.demo.ufrn.domain.animal;

public class Cachorro extends Animal {

    public Cachorro(String name, int idade, String sexo) {
        super(name, idade, sexo);
    }

    public void falar() {
        System.out.println("Au au");
    }

    public void comer() {
        System.out.println("Comendo ração");
    }

    public void dormir() {
        System.out.println("Dormindo...");
    }
}
