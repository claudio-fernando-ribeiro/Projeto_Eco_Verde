package br.univille.projeto_final.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.projeto_final.entity.Material;

//PROF WALTER
@Repository

public interface MaterialRepository 
        extends JpaRepository<Material,Long>{

          List<Material> findByNomeIgnoreCaseContaining(String nome);
   
}
