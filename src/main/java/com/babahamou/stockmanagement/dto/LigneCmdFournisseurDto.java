package com.babahamou.stockmanagement.dto;
import lombok.*;
import java.math.BigDecimal;
@Getter @Setter
@Builder
public class LigneCmdFournisseurDto  {
    private Integer id;
    private ArticleDto article;
    private CommandeFournisseurDto commandeFournisseur;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;

}
