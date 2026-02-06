package tn.esprit.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;
    private String nom;
    private String pays;
    private float budgetAnnuel;
    private Boolean bloquerContrat;
}
