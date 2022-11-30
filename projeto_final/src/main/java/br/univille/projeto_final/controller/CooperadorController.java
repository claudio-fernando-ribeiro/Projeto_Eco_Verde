package br.univille.projeto_final.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projeto_final.repository.CooperadorRepository;
import br.univille.projeto_final.service.CooperadorService;
import br.univille.projeto_final.service.LocalService;
import br.univille.projeto_final.service.MaterialService;

@Controller
@RequestMapping("/cooperadores")
public class CooperadorController {

    //Verificar 
    @Autowired
    private CooperadorRepository repository;
    /* 
    @Autowired
    private CooperadorService service;
    @Autowired
    private LocalService localService;
    @Autowired
    private MaterialService materialservice;
        // TODO Auto-generated method stub

    @GetMapping
    public ModelAndView index(){
        var listaCooperador = service.getAll();
        return new ModelAndView("cooperadores/index");
    }
*/
    @GetMapping("/cadastro")
    public ModelAndView cadastro(){
        return new ModelAndView("cooperadores/formCadastro");
    }
}


//teste cristina
//teste Claudio
