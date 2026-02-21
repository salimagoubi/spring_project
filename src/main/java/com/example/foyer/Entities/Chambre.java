package com.example.foyer.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor

@Builder

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    public Long getIdChambre() {
        return idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }

    public Chambre(Long idChambre, Long numeroChambre, TypeChambre typeC) {
        this.idChambre = idChambre;
        this.numeroChambre = numeroChambre;
        this.typeC = typeC;
    }
}
