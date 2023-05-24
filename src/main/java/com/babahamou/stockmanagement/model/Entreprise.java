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
public class Entreprise extends AbstractEntity {
 private String nom;
 private String description;
 @Embedded
 private Adresse adresse;
 private String codeFiscal;

 private String numTel;
 private String mail;
 private String  siteWeb;
 private String photo;
 @OneToMany(mappedBy = "entreprise")
 private List<Utilisateur> utilisateurs;


}
