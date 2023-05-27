package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.Adresse;
import com.babahamou.stockmanagement.model.Entreprise;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import java.util.List;
@Getter @Setter
@Builder
public class EntrepriseDto {
 private Integer id;
 private String nom;
 private String description;
 private AdresseDto adresse;
 private String codeFiscal;
 private String numTel;
 private String mail;
 private String  siteWeb;
 private String photo;
 @JsonIgnore
 private List<UtilisateurDto> utilisateurs;

 /**
  * La methode pour faire le mapping de Enteprise vers EntrepriseDto
  * la manipulation de DTO == DATA TRANSFERT OBJECT
  * @param entreprise
  * @return
  */
 public static EntrepriseDto fromEntity(Entreprise entreprise){
  if (entreprise == null){
   return null;
   //TODO The exception ..
  }
  return EntrepriseDto.builder()
          .id(entreprise.getId())
          .nom(entreprise.getNom())
          .adresse(AdresseDto.fromEntity(entreprise.getAdresse()))
          .codeFiscal(entreprise.getCodeFiscal())
          .mail(entreprise.getMail())
          .numTel(entreprise.getNumTel())
          .description(entreprise.getDescription())
          .siteWeb(entreprise.getSiteWeb())
          .photo(entreprise.getPhoto())
          .build();
 }

 /**
  * La methode Pour Faire le mapping de EntrepriseDto vers Entreprise
  * @param entrepriseDto
  * @return
  */

 public static Entreprise toEntity(EntrepriseDto entrepriseDto){
  if (entrepriseDto == null){
   return  null;
   //TODO The Exception ..
  }
  Entreprise entreprise = new Entreprise();
  entreprise.setId(entrepriseDto.getId());
  entreprise.setNom(entrepriseDto.getNom());
  entreprise.setMail(entrepriseDto.getMail());
  entreprise.setAdresse(AdresseDto.toEntity(entrepriseDto.getAdresse()));
  entreprise.setDescription(entrepriseDto.getDescription());
  entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());
  entreprise.setNumTel(entrepriseDto.getNumTel());
  entreprise.setSiteWeb(entrepriseDto.getSiteWeb());
  entreprise.setPhoto(entrepriseDto.getPhoto());
  return  entreprise;
 }


}
