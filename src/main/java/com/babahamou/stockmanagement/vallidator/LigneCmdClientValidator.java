package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.LigneCmdClientDto;

import java.util.ArrayList;
import java.util.List;

public class LigneCmdClientValidator {
    public static List<String> validate(LigneCmdClientDto ligneCmdClientDto){
        List<String> errors = new ArrayList<>();
        if (ligneCmdClientDto == null){
            errors.add("Veuillez Renseigner la quantité ");
            errors.add("Veuillez Renseigner la Le prix unitaire ");
            errors.add("Veuillez Selectionner l'article ");
            errors.add("Veuillez Selectionner Commande Client ");
            return  errors;
        }

        if (ligneCmdClientDto.getQuantite() == null){
            errors.add("Veuillez Renseigner la quantité ");
        }
        if (ligneCmdClientDto.getPrixUnitaire() == null){
            errors.add("Veuillez Renseigner la Le prix unitaire ");
        }
        if (ligneCmdClientDto.getArticle() == null){
            errors.add("Veuillez Selectionner l'article ");
        }
        if (ligneCmdClientDto.getCommandeClient() == null){
            errors.add("Veuillez Selectionner Commande Client ");
        }



        return errors;
    }
}
