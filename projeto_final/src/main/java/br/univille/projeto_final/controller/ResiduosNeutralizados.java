package br.univille.projeto_final.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/residuosNeutralizados")
public class ResiduosNeutralizados {
    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("residuosNeutralizados/index");
    }
}

/* import br.univille.projeto_final.entity.Cooperador;

@Controller
@RequestMapping("/residuosNeutralizados")
public class ResiduosNeutralizados {
    @GetMapping
    public ModelAndView cadastro(){
        
        Cooperador cooperador = new Cooperador();

        
        return new ModelAndView("cooperador/formCadastro", "cooperador", cooperador);
    }
} */
