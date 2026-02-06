package tn.esprit.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPosition;

    private int classement;
    private int nbPoints;
}
