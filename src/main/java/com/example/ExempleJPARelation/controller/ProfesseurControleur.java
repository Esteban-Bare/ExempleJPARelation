package com.example.ExempleJPARelation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/professeur")
public class ProfesseurControleur {

    @GetMapping("/")
    public String getIndexProfessur() {
        return "";
    }
}
