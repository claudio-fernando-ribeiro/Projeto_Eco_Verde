package br.univille.projeto_final.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projeto_final.service.CooperadorService;


@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
    
    @Autowired
    private CooperadorService service;

    @GetMapping
    public ModelAndView index(){
        var listaCooperadores = service.getAll();
        return new ModelAndView("funcionario/index", "listaCooperadores", listaCooperadores);
    } 
}