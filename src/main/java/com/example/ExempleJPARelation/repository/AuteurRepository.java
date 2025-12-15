package com.example.ExempleJPARelation.repository;

import com.example.ExempleJPARelation.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur,Long> {
}
