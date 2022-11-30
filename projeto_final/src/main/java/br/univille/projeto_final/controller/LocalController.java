package br.univille.projeto_final.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projeto_final.repository.LocalRepository;
import br.univille.projeto_final.service.LocalService;

@Controller
@RequestMapping("/local")
public class LocalController {

    @Autowired
    private LocalService service;

    @GetMapping
    public ModelAndView index(){
        var listaDeLocais = service.getAll();
        return new ModelAndView("local/index", "listaDeLocais", listaDeLocais);
    }
}
