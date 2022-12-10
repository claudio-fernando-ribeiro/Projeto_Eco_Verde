package br.univille.projeto_final.controller;

import java.util.ArrayList;
import java.util.HashMap;

//import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projeto_final.entity.Cooperador;
import br.univille.projeto_final.service.CooperadorService;
import br.univille.projeto_final.service.MaterialService;


@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
    
    @Autowired
    private CooperadorService service;
    @Autowired
    private MaterialService materialService;

    @GetMapping
    public ModelAndView index(){
        var listaCooperadores = service.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("listaCooperadores", listaCooperadores);
        ArrayList<Integer> totalQtds = new ArrayList<Integer>();
        for(Cooperador umCoop : listaCooperadores){
            totalQtds.add(materialService.somaQuantidade(umCoop.getId()));
        }
        dados.put("totalQtds", totalQtds);

        return new ModelAndView("funcionario/index", dados);
    } 

}



