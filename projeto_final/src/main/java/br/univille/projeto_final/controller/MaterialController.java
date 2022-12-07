package br.univille.projeto_final.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projeto_final.entity.Material;
import br.univille.projeto_final.service.MaterialService;

@Controller
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private MaterialService service;

    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("materialRecebido/index");
    }

/*     @GetMapping(value="/novo")
    public ModelAndView novo(){
        var Material = new Material();
        return new ModelAndView("cidade2/form", "cidade", cidade);
    } */

    @PostMapping(params = "index")
    public ModelAndView save(Material material){ 
        service.save(material);
        return new ModelAndView("materialRecebido/index");
        }    

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar (@PathVariable("id") Long id){
        var umMaterial = service.findById(id);
        return new ModelAndView("material", "cidade", umMaterial);
    }
    
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/funcionarios");
    }

}