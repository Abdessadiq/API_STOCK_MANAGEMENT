package com.babahamou.stockmanagement.dto;
import lombok.*;
import java.time.Instant;
import java.util.List;
@Getter @Setter
@Builder

public class CommandeFournisseurDto  {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private FournisseurDto fournisseur;
    private List<LigneCmdFournisseurDto> ligneCmdFournisseurs;

}
