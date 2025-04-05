package com.demo.ufrn.domain.user;

import com.demo.ufrn.domain.animal.Animal;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
public class User implements UserI {

    static int next_id = 1;
    private int id = 0;
    private String nome;
    private String senha;
    private List<Animal> animais;

    public User() {
        super();
    }

    public User(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        animais = new ArrayList<>();
        id += next_id;
        next_id++;
    }

    @Override
    public void fazerPagemento() {
        System.out.println("Realizando pagamento!");
    }

    @Override
    public void buscarPet() {
        System.out.println("Buscando pet");
    }
}
