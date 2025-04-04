package com.demo.ufrn.service;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    List<String> arry = Arrays.asList("erick", "cmil", "ciço", "giza");

    public String sayHello() {
        return "Hello World";
    }

    public void add(String s) {
        arry.add(s);
    }

    public String mostrar(){
        return arry.toString();
    }

    public String mostrar(String index){
        return arry.get(Integer.parseInt(index));
    }
}
