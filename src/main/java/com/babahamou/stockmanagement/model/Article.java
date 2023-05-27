package com.babahamou.stockmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * La classe D'article..
 */
@Getter @Setter
//@Builder // permet de créer un builder en utilisant design pattern builder
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

public class Article extends AbstractEntity {
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTtc;
    private String photo;

    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "article")
    private List<LigneVente> ligneVentes;

    @OneToMany(mappedBy = "article")
    private List<LigneCmdClient> ligneCmdClients;

    @OneToMany(mappedBy = "article")
    private List<LigneCmdFournisseur> ligneCmdFournisseurs;

    @OneToMany(mappedBy = "article")
    private List<MouvementStock> mouvementStocks;


}
