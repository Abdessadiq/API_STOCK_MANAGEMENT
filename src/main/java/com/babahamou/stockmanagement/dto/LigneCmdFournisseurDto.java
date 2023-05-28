package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.LigneCmdClient;
import com.babahamou.stockmanagement.model.LigneCmdFournisseur;
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
    private Integer idEntreprise;

    public static LigneCmdFournisseurDto fromEntity(LigneCmdFournisseur ligneCmdFournisseur){
        if (ligneCmdFournisseur == null){
            return null;
        }
        return  LigneCmdFournisseurDto.builder()
                .id(ligneCmdFournisseur.getId())
                .quantite(ligneCmdFournisseur.getQuantite())
                .idEntreprise(ligneCmdFournisseur.getIdEntreprise())
                .article(ArticleDto.fromEntity(ligneCmdFournisseur.getArticle()))
                .prixUnitaire(ligneCmdFournisseur.getPrixUnitaire())
                .build();
    }

    public static LigneCmdFournisseur toEntity(LigneCmdFournisseurDto ligneCmdFournisseurDto){
        if (ligneCmdFournisseurDto == null){
            return null;
        }

        LigneCmdFournisseur ligneCmdFournisseur = new LigneCmdFournisseur();
        ligneCmdFournisseur.setId(ligneCmdFournisseurDto.getId());
        ligneCmdFournisseur.setQuantite(ligneCmdFournisseurDto.getQuantite());
        ligneCmdFournisseur.setPrixUnitaire(ligneCmdFournisseurDto.getPrixUnitaire());
        ligneCmdFournisseur.setIdEntreprise(ligneCmdFournisseurDto.getIdEntreprise());
        ligneCmdFournisseur.setArticle(ArticleDto.toEntity(ligneCmdFournisseurDto.getArticle()));
        return ligneCmdFournisseur;
    }

}
