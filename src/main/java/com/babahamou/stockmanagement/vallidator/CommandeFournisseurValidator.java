package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.CommandeClientDto;
import com.babahamou.stockmanagement.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {
    public static List<String> validate(CommandeFournisseurDto commandeFournisseurDto){
        List<String> errors = new ArrayList<>();
        if (commandeFournisseurDto == null){
            errors.add("Veuillez Renseigner le code de la commande Fournisseur");
            errors.add("Veuillez Renseigner la date de la commande Fournisseur");
            errors.add("Veuillez Selectionner le Fournisseur la commande Fournisseur");
            return errors;

        }

        if (!StringUtils.hasLength(commandeFournisseurDto.getCode())){
            errors.add("Veuillez Renseigner le code de la commande Fournisseur");
        }
        if (commandeFournisseurDto.getDateCommande() == null){
            errors.add("Veuillez Renseigner la date de la commande Fournisseur");
        }
        if (commandeFournisseurDto.getFournisseur() == null){
            errors.add("Veuillez Selectionner le Fournisseur la commande Fournisseur");
        }
        return errors;


    }
}
