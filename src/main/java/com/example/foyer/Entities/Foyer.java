package com.example.foyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor

@Builder


public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;

    private Long capaciteFoyer;

    public Long getIdFoyer() {
        return idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public Long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setCapaciteFoyer(Long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    public Foyer(Long idFoyer, String nomFoyer, Long capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }
}
