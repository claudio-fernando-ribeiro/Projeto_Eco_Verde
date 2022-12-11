package br.univille.projeto_final.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.projeto_final.entity.Residuo;
import br.univille.projeto_final.repository.ResiduoRepository;
import br.univille.projeto_final.service.ResiduoService;

@Service
public class ResiduoServiceImpl implements ResiduoService{

    @Autowired
    private ResiduoRepository repositorio;

    @Override
    public List<Residuo> getAll() {
        return repositorio.findAll();
    }

    @Override
    public Residuo save(Residuo residuo) {
        return repositorio.save(residuo);
    }

    @Override
    public Residuo findyById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Residuo();
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public List<Residuo> findByNome(String nome) {
        return repositorio.findByNomeIgnoreCaseContaining(nome);
    }  
}