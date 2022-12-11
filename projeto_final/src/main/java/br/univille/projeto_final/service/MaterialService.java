package br.univille.projeto_final.service;

import java.util.List;
import br.univille.projeto_final.entity.Material;

public interface MaterialService {
    List<Material> getAll();
    Material save (Material material);
    Material findById (long id);
    void delete(long id);
    Integer somaQuantidade(long idCooperador);
}
