package br.com.etechas.study.controller;

import br.com.etechas.study.Service.DisciplinaService;
import br.com.etechas.study.entity.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService service;

    public List<Disciplina> listar(){
        return service.listar();
    }
}
