package br.edu.ifal.projetoweb2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MeuControlador {

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView resposta = new ModelAndView("index.html");
        return resposta;
    }

    @RequestMapping("/form")
    public ModelAndView formulario(){

        return new ModelAndView("form.html");
    }
    @RequestMapping("/formContato")
    public ModelAndView cadastro() {
        return new ModelAndView("form.html");
        
        
    }
    
  

}