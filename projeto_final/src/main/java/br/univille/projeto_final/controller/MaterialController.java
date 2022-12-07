package br.univille.projeto_final.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projeto_final.entity.Material;
import br.univille.projeto_final.service.MaterialService;
import br.univille.projeto_final.service.ResiduoService;

@Controller
@RequestMapping("/materiais")
public class MaterialController {

    @Autowired
    private MaterialService service;

    @Autowired
    private ResiduoService residuoService;

    @GetMapping
    public ModelAndView index(){

        var listaMateriais = service.getAll();

        return new ModelAndView("material/index", "listaMateriais", listaMateriais);

    }

    @GetMapping("/novo")
        public ModelAndView novo(){
            var novoMaterial = new Material();
            var listaResiduos = residuoService.getAll();
            HashMap<String,Object> dados = new HashMap<>();
            dados.put("listaResiduos",listaResiduos);
            dados.put("material",novoMaterial);
            return new ModelAndView("material/form",dados);
        } 
    

    @PostMapping(params = "form")
    public ModelAndView save(Material material){ 
        service.save(material);
        return new ModelAndView("redirect:/materiais");
        }    

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar (@PathVariable("id") Long id){
        var umMaterial = service.findById(id);
        var listaResiduos = residuoService.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("listaResiduos",listaResiduos);
        dados.put("umMaterial",umMaterial);
        return new ModelAndView("material/form", dados);
    }
    
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/materiais");
    } 

}
