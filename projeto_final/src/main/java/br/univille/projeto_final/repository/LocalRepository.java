package br.univille.projeto_final.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projeto_final.entity.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long>{
    
}
