package com.fiap.demo;


import com.fiap.demo.model.CursoRepository;
import com.fiap.demo.model.CursoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CursoController {

    @Autowired
    CursoRepository cursoRepo;

    @RequestMapping(value = "/api/curso", method = RequestMethod.POST)
    public CursoEntity criar(@RequestBody CursoEntity curso){

        cursoRepo.save(curso);

        return curso;

    }

    @RequestMapping("/api/curso")
    public List<CursoEntity>  obterTodos(){
        return cursoRepo.findAll();
    }


}
