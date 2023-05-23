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

public class CommandeClient extends AbstractEntity {
    private String code;
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCmdClient> ligneCmdClients;

}
