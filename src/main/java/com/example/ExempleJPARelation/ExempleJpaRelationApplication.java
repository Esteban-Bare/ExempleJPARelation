package com.example.ExempleJPARelation;

import com.example.ExempleJPARelation.model.Auteur;
import com.example.ExempleJPARelation.model.Livre;
import com.example.ExempleJPARelation.repository.AuteurRepository;
import com.example.ExempleJPARelation.repository.LivreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExempleJpaRelationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExempleJpaRelationApplication.class, args);
	}

    @Bean
    CommandLineRunner commandLineRunner(LivreRepository livreRepository, AuteurRepository auteurRepository) {
        return args -> {
            auteurRepository.save(new Auteur("Esteban"));
            auteurRepository.save(new Auteur("Alejandro"));

            Auteur auteur1 = auteurRepository.findById(1L).get();
            Auteur auteur2 = auteurRepository.findById(2L).get();

            livreRepository.save(new Livre("ALC 1", auteur1));
            livreRepository.save(new Livre("ALC 2", auteur1));
            livreRepository.save(new Livre("ALC pro", auteur2));
        };
    }

}
