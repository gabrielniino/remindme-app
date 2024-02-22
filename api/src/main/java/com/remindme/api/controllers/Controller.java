package com.remindme.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.remindme.api.models.Pessoa;
import com.remindme.api.repositories.PessoaRepository;

@RestController
public class Controller {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/listar")
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    @GetMapping("/listar/{id}")
    public Pessoa listarPorId(@PathVariable long id) {
        return pessoaRepository.findById(id);
    }

    @PostMapping("/salvar")
    public Pessoa cadastrar(@RequestBody Pessoa pessoaInput) {
        return pessoaRepository.save(pessoaInput);
    }

    @PutMapping("/atualizar")
    public Pessoa editarPessoa(@RequestBody Pessoa pessoaInput ) {
        return pessoaRepository.save(pessoaInput);
    }

    @DeleteMapping("/remover/{id}")
    public void remover(@PathVariable long id) {
        Pessoa pessoaRemove = pessoaRepository.findById(id);
        pessoaRepository.delete(pessoaRemove);
    }
}
