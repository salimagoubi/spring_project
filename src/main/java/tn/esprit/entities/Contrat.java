package tn.esprit.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private float montant;
    private String annee;
    private Boolean archived;
}
