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

        auteurRepository.save(new Auteur("Esteban"));
        auteurRepository.save(new Auteur("Alejandro"));

        Auteur auteur1 = auteurRepository.findById(1L).get();
        Auteur auteur2 = auteurRepository.findById(2L).get();

        livreRepository.save(new Livre("ALC 1", auteur1));
        livreRepository.save(new Livre("ALC 2", auteur1));
        livreRepository.save(new Livre("ALC pro", auteur2));
    }

    public Auteur getAuteurById(Long id) {
        return auteurRepository.findById(id).get();
    }
}
