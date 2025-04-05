package com.demo.ufrn.controller;

import com.demo.ufrn.domain.animal.Animal;
import com.demo.ufrn.domain.user.Cliente;
import com.demo.ufrn.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.demo.ufrn.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@ResponseBody
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private Service service;

    @GetMapping()
    public String status() {
        return "Creche em funcionamento";
    }

    @PostMapping("cria/tutor")
    public Cliente cria_tutor(@RequestBody Cliente user) {
        return service.cria_user(user);
    }

    @PostMapping("cria/pet/{id_tutor}")
    public void cria_pet(@RequestBody Animal pet, @PathVariable(name = "id_tutor") int id_tutor) {
        service.cria_pet(pet, id_tutor);
    }

    @GetMapping("lista/pets/tutor/{id}")
    public List<Animal> lista_pets_tutor(@PathVariable(name = "id") int id) {
        return service.lista_pets_tutor(id);
    }

    @PutMapping("pagamento/{id}")
    public void realiza_pagamento(@PathVariable(name = "id") int id) {
        service.realiza_pagamento(id);
    }
}
