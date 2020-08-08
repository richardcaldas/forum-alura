package com.alura.forum.controller;


import com.alura.forum.model.Topico;
import com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping
    public List<Topico> list(){
        List<Topico> topicos = topicoRepository.findAll();
        return topicos;
        //testandooooooo
    }

}
