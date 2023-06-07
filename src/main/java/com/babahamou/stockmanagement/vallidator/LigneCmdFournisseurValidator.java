package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.LigneCmdFournisseurDto;

import java.util.ArrayList;
import java.util.List;

public class LigneCmdFournisseurValidator {
    public static List<String> validate(LigneCmdFournisseurDto ligneCmdFournisseurDto){
        List<String> errors = new ArrayList<>();
        if (ligneCmdFournisseurDto == null){
            errors.add("Veuillez Renseigner la quantité ");
            errors.add("Veuillez Renseigner la Le prix unitaire ");
            errors.add("Veuillez Selectionner l'article ");
            errors.add("Veuillez Selectionner Commande Fournisseur ");
            return  errors;
        }

        if (ligneCmdFournisseurDto.getQuantite() == null){
            errors.add("Veuillez Renseigner la quantité ");
        }
        if (ligneCmdFournisseurDto.getPrixUnitaire() == null){
            errors.add("Veuillez Renseigner la Le prix unitaire ");
        }
        if (ligneCmdFournisseurDto.getArticle() == null){
            errors.add("Veuillez Selectionner l'article ");
        }
        if (ligneCmdFournisseurDto.getCommandeFournisseur() == null){
            errors.add("Veuillez Selectionner Commande Fournisseur ");
        }



        return errors;
    }
}
