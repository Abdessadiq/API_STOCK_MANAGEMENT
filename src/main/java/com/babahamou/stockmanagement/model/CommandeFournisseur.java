package com.babahamou.stockmanagement.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class CommandeFournisseur extends AbstractEntity {

    private String code;
    private Instant dateCommande;

    @Enumerated(EnumType.STRING)
    private EtatCommande etatCommande;
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;


    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCmdFournisseur> ligneCmdFournisseurs;

}
