package com.babahamou.stockmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class LigneVente extends AbstractEntity {
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    @ManyToOne
    @JoinColumn(name = "vente_id")
    private Vente vente;

}
