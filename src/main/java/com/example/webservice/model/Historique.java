package com.example.webservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Historique {

    private int id_utilisateur;
    private String nom;
    private String day;
    private String prix;
}
