package br.univille.projeto_final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projeto_final.entity.Material;

@Repository
public interface MaterialRecebidoRepository extends JpaRepository<Material, Integer> {
}