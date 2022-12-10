package br.univille.projeto_final.service;

import java.util.List;
import br.univille.projeto_final.entity.Residuo;

public interface ResiduoService {
    List<Residuo> getAll();
    Residuo save(Residuo residuo);
    Residuo findyById(long id);
    void delete(long id);
    List<Residuo> findByNome(String nome);
}
