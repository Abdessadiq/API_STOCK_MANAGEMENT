package com.babahamou.stockmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class CommandeFournisseur extends AbstractEntity {

    private String code;
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCmdFournisseur> ligneCmdFournisseurs;

}
