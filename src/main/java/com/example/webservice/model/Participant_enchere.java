package com.example.webservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class

Participant_enchere {
    private Integer id_utilisateur;
    private Integer id_manao_enchere;
    private Double prix;
    private Date daty;


}
