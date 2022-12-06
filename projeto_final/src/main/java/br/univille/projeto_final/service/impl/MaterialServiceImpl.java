package br.univille.projeto_final.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projeto_final.entity.Material;
import br.univille.projeto_final.repository.MaterialRecebidoRepository;
import br.univille.projeto_final.service.MaterialService;

@Service
public class MaterialServiceImpl implements MaterialService{

    @Autowired
    private MaterialRecebidoRepository repositorio;

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
        var resultado = repositorio.findById((int) id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Material();
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById((int) id);
    }

    @Override
    public List<Material> findByNome(String nome) {
        return repositorio.findByNomeIgnoreCaseContaining(nome);
    }
}