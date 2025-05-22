package br.com.etechas.study.entity.Service;

import br.com.etechas.study.entity.Disciplina;
import br.com.etechas.study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> listar(){
        return repository.findAll();
    }
}
