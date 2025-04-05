package com.demo.ufrn.service;

import com.demo.ufrn.domain.animal.Animal;
import com.demo.ufrn.domain.user.Cliente;
import com.demo.ufrn.domain.user.User;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    List<Cliente> usuarios = new ArrayList<Cliente>();

    public Cliente cria_user(Cliente user) {
        usuarios.add(user);
        return usuarios.get(usuarios.size() - 1);
    }

    public void cria_pet(Animal animal, int id_tutor) {
        for(Cliente c : usuarios) {
            if(c.getId() == id_tutor) {
                c.getAnimais().add(animal);
                break;
            }
        }
    }

    public List<Animal> lista_pets_tutor(int id_tutor) {
        for(Cliente c : usuarios) {
            if(c.getId() == id_tutor) {
                return c.getAnimais();
            }
        }
        return null;
    }

    public void realiza_pagamento(int id) {
        for(Cliente c : usuarios) {
            if(c.getId() == id) {
                c.fazerPagemento();
                break;
            }
        }
        System.out.println("Usuario não encontrado");
    }
}
