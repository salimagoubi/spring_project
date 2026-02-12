package tn.esprit.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Sponsor")
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;

    private String nom;
    private String pays;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;

    @OneToMany(mappedBy="sponsor")
    private List<Contrat> contrats;
}
