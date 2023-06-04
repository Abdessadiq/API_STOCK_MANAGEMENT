package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidateur {
    /**
     * La methode Qui permet de faire la validation des champ pout utilisateur..
     * @param utilisateurDto
     * @return
     */
    public static List<String> validate(UtilisateurDto utilisateurDto){
     List<String> errors = new ArrayList<>();

     if (utilisateurDto == null){
         errors.add("Veuillez Renseigner Le nom de l'Utilisateur");
         errors.add("Veuillez Renseigner Le Prenom de l'Utilisateur");
         errors.add("Veuillez Renseigner L'E-Mail de l'Utilisateur");
         errors.add("Veuillez Renseigner Le mot de passe  de l'Utilisateur");
         errors.add("Veuillez Renseigner l'adresse de l'utilisateur");

     }

     if (!StringUtils.hasLength(utilisateurDto.getNom())){
         errors.add("Veuillez Renseigner Le nom de l'Utilisateur");
     }

     if (!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Veuillez Renseigner Le Prenom de l'Utilisateur");
     }
     if (!StringUtils.hasLength(utilisateurDto.getMail())){
            errors.add("Veuillez Renseigner L'E-Mail de l'Utilisateur");
     }
     if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("Veuillez Renseigner Le mot de passe  de l'Utilisateur");
     }
     if (utilisateurDto.getDateNaissance() == null){
         errors.add("Veuillez Renseigner La date de naissance de l'utilisateur ..");
     }
     if (utilisateurDto.getAdresse() == null){
         errors.add("Veuillez Renseigner l'adresse de l'utilisateur");
     }else {
         if (!StringUtils.hasLength(utilisateurDto.getAdresse().getAdress1())){
             errors.add("Le champ 'Adresse 1' est Oblégatoire ");
         }
         if (!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())){
             errors.add("Le champ 'Ville' est Oblégatoire ");
         }
         if (!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())){
             errors.add("Le champ 'Pays' est Oblégatoire ");
         }
         if (!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostal())){
             errors.add("Le champ 'Code Postal' est Oblégatoire ");
         }
     }

     return errors;

    }
}
