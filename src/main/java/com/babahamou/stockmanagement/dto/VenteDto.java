package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.Vente;
import lombok.*;
import java.time.Instant;
import java.util.List;
@Getter @Setter
@Builder
public class VenteDto {
    private Integer id;
    private String code;
    private Instant dateVente;
    private String commantaire;
    private Integer idEntreprise;

    private List<LigneVenteDto> ligneVentes;

    public static VenteDto fromEntity(Vente vente){
        if (vente == null){
            return  null;
        }
        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .dateVente(vente.getDateVente())
                .commantaire(vente.getCommantaire())
                .idEntreprise(vente.getIdEntreprise())
                .build();
    }

    public static Vente toEntity(VenteDto venteDto){
        if (venteDto == null){
            return null;
        }
        Vente vente  = new Vente();
        vente.setId(venteDto.getId());
        vente.setCode(venteDto.getCode());
        vente.setDateVente(venteDto.getDateVente());
        vente.setCommantaire(venteDto.getCommantaire());
        vente.setIdEntreprise(venteDto.getIdEntreprise());
        return vente;
    }




}
