package br.univille.projeto_final.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.univille.projeto_final.entity.Cooperador;

@Repository
public interface CooperadorRepository extends JpaRepository<Cooperador, Long> {
    List<Cooperador> findByNomeIgnoreCaseContaining(@Param("nome") String nome);

}
