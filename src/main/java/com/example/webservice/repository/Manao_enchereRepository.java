package com.example.webservice.repository;

import com.example.webservice.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Manao_enchereRepository extends JpaRepository<Categorie, Integer> {
}
