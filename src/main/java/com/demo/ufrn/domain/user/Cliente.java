package com.demo.ufrn.domain.user;

public class Cliente extends User{

    public Cliente(String nome, String senha) {
        super(nome, senha);
    }

    public void fazerPagemento() {
        System.out.println("Fazendo pagamento");
    }

    public void buscarPet() {
        System.out.println("Buscando pet");
    }
}
