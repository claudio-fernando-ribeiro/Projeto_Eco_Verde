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
import br.univille.projeto_final.service.CooperadorService;
import br.univille.projeto_final.service.ResiduoService;

@Controller
@RequestMapping("")
public class CooperadorController {

    @Autowired
    private CooperadorService service;
    @Autowired
    private ResiduoService tipoResiduo;

    
    @GetMapping
    public ModelAndView index(){
        var listaCooperadores = service.getAll();
        return new ModelAndView("cooperador/index", "listaCooperadores", listaCooperadores);
    }

    @GetMapping("/cadastro")
    public ModelAndView cadastro(){
        var cooperador = new Cooperador();
        var listaResiduos = tipoResiduo.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("listaResiduos", listaResiduos);
        dados.put("cooperador",cooperador);
        return new ModelAndView("cooperador/formCadastro", dados);
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var umCooperador = service.findById(id);
        var listaResiduos = tipoResiduo.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("listaResiduos", listaResiduos);
        dados.put("cooperador",umCooperador);
        return new ModelAndView("cooperador/formCadastro",dados);
    }

    @PostMapping(params = "formCadastro")
    public ModelAndView save(@Validated Cooperador cooperador,
                            BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            var listaResiduos = tipoResiduo.getAll();
            HashMap<String,Object> dados = new HashMap<>();
            dados.put("cooperador", cooperador);
            dados.put("listaResiduos", listaResiduos);
            return new ModelAndView("cooperador/formCadastro",dados);
        }
        service.save(cooperador);
        return new ModelAndView("redirect:/local");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/funcionarios");
    }
}