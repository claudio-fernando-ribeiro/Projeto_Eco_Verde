package br.univille.projeto_final.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/marial")
public class MaterialController {
    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("material/index");
    }
}
