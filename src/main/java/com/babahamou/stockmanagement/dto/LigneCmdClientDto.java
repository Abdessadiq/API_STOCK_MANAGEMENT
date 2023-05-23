package com.babahamou.stockmanagement.dto;
import lombok.*;
import java.math.BigDecimal;
@Getter @Setter
@Builder

public class LigneCmdClientDto {
    private Integer id;
    private ArticleDto article;
    private CommandeClientDto commandeClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;

}
