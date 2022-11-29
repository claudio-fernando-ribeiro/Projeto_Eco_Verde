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
