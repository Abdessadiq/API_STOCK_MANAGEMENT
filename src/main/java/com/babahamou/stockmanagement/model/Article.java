package com.babahamou.stockmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;

/**
 * La classe D'article..
 */
@Getter @Setter
@Builder // permet de créer un builder en utilisant design pattern builder
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

public class Article extends AbstractEntity {
    private String codeArticle;
    private String disignation;
    private BigDecimal prixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTtc;
    private String photo;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
