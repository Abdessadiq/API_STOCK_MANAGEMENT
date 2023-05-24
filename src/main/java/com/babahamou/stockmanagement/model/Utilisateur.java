package com.babahamou.stockmanagement.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

public class Utilisateur extends AbstractEntity {
    private String nom;
    private String prenom;
    private Instant dateNaissance;
    @Embedded
    private Adresse adresse;
    private String motDePasse;
    private String mail;
    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;
    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;

}
