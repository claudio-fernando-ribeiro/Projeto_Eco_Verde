package br.univille.projeto_final;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import br.univille.projeto_final.entity.Usuario;
import br.univille.projeto_final.repository.UsuarioRepository;

@Component
public class StartSecutiry {

    @Autowired
    private UsuarioRepository repository;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        if(repository.findByNome("admin") == null){
            var adminUser = new Usuario();
            adminUser.setNome("admin");
            adminUser.setSenha("admin");
            repository.save(adminUser);
        }
    }
}


