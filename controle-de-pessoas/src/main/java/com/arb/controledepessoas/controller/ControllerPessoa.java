package com.arb.controledepessoas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arb.controledepessoas.model.Pessoa;

@RestController
@RequestMapping("/api/pessoas")
public class ControllerPessoa {
    
    @GetMapping
    public List<Pessoa> obterTodos(){
        Pessoa p1 = new Pessoa();
        p1.setNome("André");
        p1.setEmail("bronca.andre@gmail.com");
        p1.setTelefone("99475166");
        Pessoa p2 = new Pessoa();

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        return pessoas;

    }
}
