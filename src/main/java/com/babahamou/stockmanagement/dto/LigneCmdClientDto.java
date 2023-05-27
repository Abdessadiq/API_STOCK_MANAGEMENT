package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.LigneCmdClient;
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
    private Integer idEntreprise;


    public static LigneCmdClientDto fromEntity(LigneCmdClient ligneCmdClient){
        if (ligneCmdClient == null){
            return null;
        }
        return  LigneCmdClientDto.builder()
                .id(ligneCmdClient.getId())
                .quantite(ligneCmdClient.getQuantite())
                .prixUnitaire(ligneCmdClient.getPrixUnitaire())
                .idEntreprise(ligneCmdClient.getIdEntreprise())
                .article(ArticleDto.fromEntity(ligneCmdClient.getArticle()))
                .build();
    }

    public static LigneCmdClient toEntity(LigneCmdClientDto ligneCmdClientDto){
        if (ligneCmdClientDto == null){
            return null;
        }

        LigneCmdClient ligneCmdClient = new LigneCmdClient();
        ligneCmdClient.setId(ligneCmdClientDto.getId());
        ligneCmdClient.setQuantite(ligneCmdClientDto.getQuantite());
        ligneCmdClient.setIdEntreprise(ligneCmdClientDto.getIdEntreprise());
        ligneCmdClient.setArticle(ArticleDto.toEntity(ligneCmdClientDto.getArticle()));
        ligneCmdClient.setPrixUnitaire(ligneCmdClientDto.getPrixUnitaire());
        return ligneCmdClient;
    }

}
