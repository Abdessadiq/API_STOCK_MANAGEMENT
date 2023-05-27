package com.babahamou.stockmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Vente extends AbstractEntity {
    private String code;
    private Instant dateVente;
    private String commantaire;
    private Integer idEntreprise;
    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;




}
