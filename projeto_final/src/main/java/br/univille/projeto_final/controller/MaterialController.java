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
@RequestMapping("/materiais")
public class MaterialController {

    @Autowired
    private MaterialService service;

    @GetMapping
    public ModelAndView index(){

        var listaMateriais = service.getAll();

        return new ModelAndView("material/index", "listaMateriais", listaMateriais);

    }

    @GetMapping("/novo")
        public ModelAndView novo(){
            var novoMaterial = new Material();
            return new ModelAndView("material/form", "material", novoMaterial);
        } 
    

    @PostMapping(params = "form")
    public ModelAndView save(Material material){ 
        service.save(material);
        return new ModelAndView("redirect:/material");
        }    

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar (@PathVariable("id") Long id){
        var umMaterial = service.findById(id);
        return new ModelAndView("material/form", "material", umMaterial);
    }
    
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/material");
    } 

}
