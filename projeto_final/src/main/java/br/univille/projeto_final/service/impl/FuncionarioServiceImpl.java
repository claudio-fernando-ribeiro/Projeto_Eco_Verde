package br.univille.projeto_final.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projeto_final.entity.Funcionario;
import br.univille.projeto_final.repository.FuncionarioRepository;
import br.univille.projeto_final.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{

    @Autowired
    private FuncionarioRepository repository;

    @Override
    public List<Funcionario> getAll() {
        return repository.findAll();
    }

    
    
}
