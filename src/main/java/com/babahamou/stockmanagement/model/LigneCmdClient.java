package com.babahamou.stockmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;


@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

public class LigneCmdClient extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "commande_client_id")
    private CommandeClient commandeClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;

}
