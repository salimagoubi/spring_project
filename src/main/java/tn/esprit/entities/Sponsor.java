package tn.esprit.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name="Sponsor")
public class Sponsor {
    @Id
    private Long idSponsor;

    private String nom;

    private String pays;

    private Float budgetAnnuel;

    private Boolean bloquerContrat;

    Boolean archived;

    LocalDate dateCreation;

    LocalDate dateDerniereModification;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="Sponsor")
    private List<Contrat> contrats;
}
