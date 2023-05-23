package com.babahamou.stockmanagement.dto;
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
    private List<LigneVenteDto> ligneVentes;




}
