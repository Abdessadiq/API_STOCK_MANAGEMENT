package com.babahamou.stockmanagement.dto;
import lombok.*;
import java.math.BigDecimal;
@Getter @Setter
@Builder
public class LigneVenteDto {
    private Integer id;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private VenteDto vente;

}
