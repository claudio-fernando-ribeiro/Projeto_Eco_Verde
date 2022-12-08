package br.univille.projeto_final.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.univille.projeto_final.entity.Residuo;

@Repository
public interface ResiduoRepository extends JpaRepository<Residuo,Long>{
List<Residuo> findByNomeIgnoreCaseContaining(@Param("nome") String nome);
}