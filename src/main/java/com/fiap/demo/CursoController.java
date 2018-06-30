package com.fiap.demo;


import com.fiap.demo.model.CursoRepository;
import com.fiap.demo.model.CursoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/curso")
@RestController
public class CursoController {

    @Autowired
    CursoRepository cursoRepo;


      public CursoEntity criar(@RequestBody CursoEntity curso){

        cursoRepo.save(curso);

        return curso;

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<CursoEntity>  obterTodos(){
        return cursoRepo.findAll();
    }


}
