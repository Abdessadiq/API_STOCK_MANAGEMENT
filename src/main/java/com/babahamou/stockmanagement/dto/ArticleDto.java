package com.babahamou.stockmanagement.dto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Builder
@Getter @Setter
public class ArticleDto {
    private Integer id;
    private String codeArticle;
    private String disignation;
    private BigDecimal prixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTtc;
    private String photo;
    private CategoryDto category;
}
