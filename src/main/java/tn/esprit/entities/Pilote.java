package tn.esprit.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;
    private int nbPointsTotal;
    private int classementGeneral;
}
