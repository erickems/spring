package com.demo.ufrn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.demo.ufrn.service.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@ResponseBody
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private Service service;

    @GetMapping()
    public String status() {
        return "Servidor rodando";
    }

    @GetMapping("helloWorld")
    public String get(){
        return service.sayHello();
    }

    @PostMapping("add/{name}")
    public void add(@PathVariable String name){
        service.add(name);
    }

    @GetMapping("mostrar")
    public String mostrar(){
        return service.mostrar();
    }

    @GetMapping("mostrar/index")
    public String mostrar(@RequestParam(name = "index") String index){
        return service.mostrar(index);
    }
}
