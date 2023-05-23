package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.Adresse;
import lombok.*;
import java.util.List;
@Getter @Setter
@Builder
public class EntrepriseDto {
 private Integer id;
 private String nom;
 private String description;
 private Adresse adresse;
 private String codeFiscal;
 private String numTel;
 private String mail;
 private String  siteWeb;
 private String photo;
 private List<UtilisateurDto> utilisateurs;


}
