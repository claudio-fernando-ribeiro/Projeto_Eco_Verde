package br.univille.projeto_final.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projeto_final.entity.Cooperador;
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
    
    private CooperadorService service;
    
    private LocalService localService;
    
    private MaterialService materialService;
        // TODO Auto-generated method stub
    
    @GetMapping
    public ModelAndView index(){
        var listaCooperadores = service.getAll();
        return new ModelAndView("cooperador/index", "listaCooperadores", listaCooperadores);
    }

    @GetMapping("/cadastro")
    public ModelAndView cadastro(){
        var cooperador = new Cooperador();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("cooperador",cooperador);
        return new ModelAndView("cooperadores/formCadastro");
    }
    
    public ModelAndView alterar(@PathVariable("id") long id){
        var umCooperador = service.findById(id);
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("cooperador",umCooperador);
        return new ModelAndView("cooperador/formCadastro",dados);
    }
    @PostMapping(params = "formCadastro")
    public ModelAndView save(@Validated Cooperador cooperador,
                            BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            HashMap<String,Object> dados = new HashMap<>();
            dados.put("cooperador", cooperador);
            return new ModelAndView("cooperador/formCadastro",dados);
        }
        service.save(cooperador);

        return new ModelAndView("redirect:/cooperador");
    }
}


//teste cristina
//teste Claudio
