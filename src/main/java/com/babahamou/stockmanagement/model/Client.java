package com.babahamou.stockmanagement.model;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

public class Client extends AbstractEntity {
    private String nom;
    private String prenom;
    @Embedded // Annotation Pour dire que ce champs est un champ composé et qu'on va utilisé dans plusieur entities
    private Adresse adresse;
    private String numTel;
    private String mail;
    private String photo;
    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;


}
