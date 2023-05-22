package com.babahamou.stockmanagement.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse implements Serializable {
    private String adress1;
    private String adress2;
    private String ville;
    private String codePostal;
    private String pays;

}
