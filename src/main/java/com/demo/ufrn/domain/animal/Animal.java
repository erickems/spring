package com.demo.ufrn.domain.animal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Animal implements AnimalI{

    private String name;
    private int idade;
    private String sexo;

    @Override
    public void falar() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
