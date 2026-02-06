package tn.esprit.entities;

import jakarta.persistence.*;

@Entity
@Table
public class DetailChampionnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailChampionnat;

    private String code;
    private String description;
}
