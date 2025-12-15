package com.example.ExempleJPARelation.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Auteur {
    @Id
    @GeneratedValue
    private Long id;

    private String prenom;

    @OneToMany(mappedBy = "auteur", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Livre> livres = new ArrayList<>();

    public Auteur() {
    }

    public Auteur(final String prenom) {
        this.prenom = prenom;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public List<Livre> getLivres() {
        return this.livres;
    }

    public void setLivres(final List<Livre> livres) {
        this.livres = livres;
    }
}
