package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.MouvementStock;
import com.babahamou.stockmanagement.model.SourceMouvementStock;
import com.babahamou.stockmanagement.model.TypeMouvement;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;


@Getter @Setter
@Builder
public class MouvementStockDto  {
    private  Integer id;
    private Instant dateMouvement;
    private BigDecimal quantite;
    private ArticleDto article;
    private TypeMouvement typeMouvement;
    private SourceMouvementStock sourceMouvementStock;
    private Integer idEntreprise;


    public static MouvementStockDto fromEntity(MouvementStock mouvementStock){
        if (mouvementStock == null){
            return null;
        }
        return MouvementStockDto.builder()
                .id(mouvementStock.getId())
                .quantite(mouvementStock.getQuantite())
                .dateMouvement(mouvementStock.getDateMouvement())
                .typeMouvement(mouvementStock.getTypeMouvement())
                .idEntreprise(mouvementStock.getIdEntreprise())
                .sourceMouvementStock(mouvementStock.getSourceMouvementStock())
                .article(ArticleDto.fromEntity(mouvementStock.getArticle()))
                .build();
    }
    public static MouvementStock toEntity(MouvementStockDto mouvementStockDto){
        if (mouvementStockDto == null){
            return null;
        }
        MouvementStock mouvementStock = new MouvementStock();
        mouvementStock.setId(mouvementStockDto.getId());
        mouvementStock.setDateMouvement(mouvementStockDto.getDateMouvement());
        mouvementStock.setQuantite(mouvementStockDto.getQuantite());
        mouvementStock.setTypeMouvement(mouvementStockDto.getTypeMouvement());
        mouvementStock.setSourceMouvementStock(mouvementStockDto.getSourceMouvementStock());
        mouvementStock.setIdEntreprise(mouvementStockDto.getIdEntreprise());
        mouvementStock.setArticle(ArticleDto.toEntity(mouvementStockDto.getArticle()));
        return mouvementStock;
    }

}
