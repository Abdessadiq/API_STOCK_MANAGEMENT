package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.LigneVente;
import lombok.*;
import java.math.BigDecimal;
@Getter @Setter
@Builder
public class LigneVenteDto {
    private Integer id;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private VenteDto vente;
    private Integer idEntreprise;


    public static LigneVenteDto fromEntity(LigneVente ligneVente){
        if (ligneVente == null){
            return null;
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .idEntreprise(ligneVente.getIdEntreprise())
                .vente(VenteDto.fromEntity(ligneVente.getVente()))
                .build();
    }

    public static LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if (ligneVenteDto == null){
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());
        ligneVente.setIdEntreprise((ligneVente.getIdEntreprise()));
        ligneVente.setVente(VenteDto.toEntity(ligneVenteDto.getVente()));
        return ligneVente;
    }

}
