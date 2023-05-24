package com.babahamou.stockmanagement.dto;
import lombok.*;

@Builder
@Getter @Setter
public class AdresseDto {
    private String adress1;
    private String adress2;
    private String ville;
    private String codePostal;
    private String pays;

}
