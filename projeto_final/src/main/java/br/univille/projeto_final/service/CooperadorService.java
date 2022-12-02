package br.univille.projeto_final.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.projeto_final.entity.Cooperador;


public interface CooperadorService {
    List<Cooperador> getAll();
    Cooperador save (Cooperador cooperador);
    Cooperador findById (long id);
    void delete (long id);
    List<Cooperador> findByNome(String nome);

}
