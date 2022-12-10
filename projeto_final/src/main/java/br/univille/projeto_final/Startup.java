package br.univille.projeto_final;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import br.univille.projeto_final.entity.Residuo;
import br.univille.projeto_final.repository.ResiduoRepository;

@Component
public class Startup {
    @Autowired
    private ResiduoRepository repository;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        if(!repository.findById(1l).isPresent()){
            Residuo residuo = new Residuo();
            residuo.setId(1l);
            residuo.setNome("Orgânico");
            repository.save(residuo);
        }
    }
}
