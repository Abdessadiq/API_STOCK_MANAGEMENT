package com.babahamou.stockmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode

public class MouvementStock extends AbstractEntity {
    private Instant dateMouvement;
    private BigDecimal quantite;
    private SourceMouvementStock sourceMouvementStock;
    private Integer idEntreprise;

    private TypeMouvement typeMouvement;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
