package br.univille.projeto_final.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projeto_final.entity.Residuo;
import br.univille.projeto_final.service.ResiduoService;

@Controller
@RequestMapping("/residuos")
public class ResiduoController {

    @Autowired
    private ResiduoService service;

    @GetMapping
    public ModelAndView index(){
        var listaResiduos = service.getAll();
        return new ModelAndView("residuo/index", "listaResiduos",
             listaResiduos);
    }

    @GetMapping("/novo")
        public ModelAndView novo(){
            var novoResiduo = new Residuo();
            return new ModelAndView("residuo/form", "residuo", novoResiduo);
        } 
    
    @PostMapping(params = "form")
    public ModelAndView save(Residuo residuo){ 
        service.save(residuo);
        return new ModelAndView("redirect:/residuos");
        }    

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar (@PathVariable("id") Long id){
        var umResiduo = service.findyById(id);
        return new ModelAndView("residuo/form", "residuo", umResiduo);
    }
    
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/residuo");
    }
}
