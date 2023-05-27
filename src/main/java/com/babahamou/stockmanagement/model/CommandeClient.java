package com.babahamou.stockmanagement.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

public class CommandeClient extends AbstractEntity {
    private String code;
    private Instant dateCommande;
    @Enumerated(EnumType.STRING)
    private EtatCommande etatCommande;
    private Integer idEntreprise;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCmdClient> ligneCmdClients;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
