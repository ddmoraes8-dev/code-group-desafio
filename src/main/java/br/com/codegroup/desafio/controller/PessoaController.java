package br.com.codegroup.desafio.controller;

import br.com.codegroup.desafio.model.Pessoa;
import br.com.codegroup.desafio.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    @GetMapping("/pessoas")
    public ModelAndView hello(ModelAndView model){
        Pessoa pessoa = new Pessoa("Daniel", LocalDate.now(), "1234", false );
        pessoa.setId(1L);
        List<Pessoa> pessoas = Arrays.asList(pessoa);

        ModelAndView modelAndView = new ModelAndView("pessoa/listaPessoas.html");
        modelAndView.addObject("pessoas", pessoas);


        return modelAndView;
    }


}
