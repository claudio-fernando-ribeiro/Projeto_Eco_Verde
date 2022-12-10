package br.univille.projeto_final.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.projeto_final.entity.Material;
import br.univille.projeto_final.repository.MaterialRepository;
import br.univille.projeto_final.service.MaterialService;

@Service
public class MaterialServiceImpl implements MaterialService{

    @Autowired
    private MaterialRepository repositorio;

    @Override
    public List<Material> getAll() {
        return repositorio.findAll();
    }

    @Override
    public Material save(Material material) {
        return repositorio.save(material);
    }

    @Override
    public Material findById(long id) {
        var result = repositorio.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        return new Material();
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public Integer somaQuantidade(long idCooperador) {
        return repositorio.somaQuantidade(idCooperador);
    } 
}
