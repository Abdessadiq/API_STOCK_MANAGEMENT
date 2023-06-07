package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.LigneCmdFournisseurDto;
import com.babahamou.stockmanagement.dto.LigneVenteDto;

import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {
    public static List<String> validate(LigneVenteDto ligneVenteDto){
        List<String> errors = new ArrayList<>();
        if (ligneVenteDto == null){
            errors.add("Veuillez Renseigner la quantité ");
            errors.add("Veuillez Renseigner la Le prix unitaire ");
            errors.add("Veuillez Selectionner l'article ");
            errors.add("Veuillez Selectionner Commande Fournisseur ");
            return  errors;
        }

        if (ligneVenteDto.getQuantite() == null){
            errors.add("Veuillez Renseigner la quantité ");
        }
        if (ligneVenteDto.getPrixUnitaire() == null){
            errors.add("Veuillez Renseigner la Le prix unitaire ");
        }
        if (ligneVenteDto.getVente() == null){
            errors.add("Veuillez Selectionner la vente ");
        }

        return errors;
    }
}
