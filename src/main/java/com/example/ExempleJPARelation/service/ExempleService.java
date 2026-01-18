package com.example.ExempleJPARelation.service;

import com.example.ExempleJPARelation.model.Auteur;
import com.example.ExempleJPARelation.model.Livre;
import com.example.ExempleJPARelation.repository.AuteurRepository;
import com.example.ExempleJPARelation.repository.LivreRepository;
import org.springframework.stereotype.Service;

@Service
public class ExempleService {
    private LivreRepository livreRepository;

    private AuteurRepository auteurRepository;

    public ExempleService(LivreRepository livreRepository,AuteurRepository auteurRepository){
        this.livreRepository = livreRepository;
        this.auteurRepository = auteurRepository;
    }

    public Auteur getAuteurById(Long id) {
        return auteurRepository.findById(id).get();
    }
}
