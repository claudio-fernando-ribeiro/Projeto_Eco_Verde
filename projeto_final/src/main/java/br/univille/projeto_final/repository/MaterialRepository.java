package br.univille.projeto_final.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.univille.projeto_final.entity.Material;

@Repository
public interface MaterialRepository 
        extends JpaRepository<Material,Long>{
          List<Material> findByNomeIgnoreCaseContaining(String nome);

          @Query("select sum(m.quantidade) from Material m where cooperador_id = ?1")
          int somaQuantidade(long idCooperador);

}
