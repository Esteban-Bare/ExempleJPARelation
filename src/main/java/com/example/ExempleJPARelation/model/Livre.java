package com.example.ExempleJPARelation.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Livre {
    @Id
    @GeneratedValue
    private Long id;

    private String titre;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    @JsonBackReference
    private Auteur auteur;

    public Livre() {
    }

    public Livre(final String titre, final Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(final String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return this.auteur;
    }

    public void setAuteur(final Auteur auteur) {
        this.auteur = auteur;
    }
}
