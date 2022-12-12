package br.univille.projeto_final.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.projeto_final.entity.Local;
import br.univille.projeto_final.repository.LocalRepository;
import br.univille.projeto_final.service.LocalService;

@Service
public class LocalServiceImpl implements LocalService {

    @Autowired
    private LocalRepository repositorio;
    @Override
    public List<Local> getAll() {
        return repositorio.findAll();
    } 
}