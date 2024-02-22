package com.remindme.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.remindme.api.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryCustom {

}