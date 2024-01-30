package br.com.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApi {
    private String teste;

    @GetMapping("/teste-api")
    public String teste() {
        return "Sucesso";
    }
    @GetMapping("/teste-api-welcome")
    public String getWelcome(
            @RequestParam(name= "name")
            String name,
            @RequestParam(name = "lastname") String lastname
    ) {
        return "Olá " + name + " " + lastname + ". \nSeja Bem Vindo";
    }
}
