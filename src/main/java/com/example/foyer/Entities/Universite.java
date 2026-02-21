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

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;

    private String adresse;

    public Long getIdUniversite() {
        return idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Universite(Long idUniversite, String nomUniversite, String adresse) {
        this.idUniversite = idUniversite;
        this.nomUniversite = nomUniversite;
        this.adresse = adresse;
    }
}
