package com.example.ExempleJPARelation.controller;

import com.example.ExempleJPARelation.model.Auteur;
import com.example.ExempleJPARelation.service.ExempleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExempleController {

    private ExempleService exempleService;

    public ExempleController(ExempleService exempleService) {
        this.exempleService = exempleService;
    }

    @GetMapping("/auteur/{id}")
    public Auteur getAuteurById(@PathVariable Long id) {
        return exempleService.getAuteurById(id);
    }
}
