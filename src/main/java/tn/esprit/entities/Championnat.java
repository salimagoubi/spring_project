package tn.esprit.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChamionnat;

    private Categorie categorie;
    private String libelleC;
    private int annee;
}
