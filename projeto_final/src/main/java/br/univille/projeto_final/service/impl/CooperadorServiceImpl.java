package br.univille.projeto_final.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projeto_final.entity.Cooperador;
import br.univille.projeto_final.repository.CooperadorRepository;
import br.univille.projeto_final.service.CooperadorService;

@Service
public class CooperadorServiceImpl 
    implements CooperadorService{
    
    @Autowired
    private CooperadorRepository repositorio;
    
    @Override
    public List<Cooperador> getAll() {
        // TODO Auto-generated method stub
        //return null;
        return repositorio.findAll();
    }

    @Override
    public Cooperador save(Cooperador cooperador) {
        return repositorio.save(cooperador);
    }

    @Override
    public Cooperador findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Cooperador();
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById(id);
    }

    @Override
    public List<Cooperador> findByNome(String nome) {
        return repositorio.findByNomeIgnoreCaseContaining(nome);
    }
}
