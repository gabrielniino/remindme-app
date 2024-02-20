package com.remindme.api.repositories;

import java.util.List;

import com.remindme.api.models.Pessoa;

public interface PessoaRepositoryCustom {

    List<Pessoa> findAll();

    Pessoa findById(long id);
}
