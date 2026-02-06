package tn.esprit.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String libelle;
    private int nbPointsTotal;
    private int classementGeneral;
}
