package br.univille.projeto_final.service;

import java.util.List;
import br.univille.projeto_final.entity.Cooperador;

public interface CooperadorService {
    List<Cooperador> getAll();
    Cooperador save (Cooperador cooperador);
    Cooperador findById (long id);
    void delete (long id);
    List<Cooperador> findByNome(String nome);

}
