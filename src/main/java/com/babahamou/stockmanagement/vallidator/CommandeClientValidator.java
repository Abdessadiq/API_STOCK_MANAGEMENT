package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {
    public static List<String> validate(CommandeClientDto commandeClientDto){
        List<String> errors = new ArrayList<>();
        if (commandeClientDto == null){
            errors.add("Veuillez Renseigner le code de la commande client");
            errors.add("Veuillez Renseigner la date de la commande client");
            errors.add("Veuillez Selectionner l'Etat de la commande client");
            errors.add("Veuillez Selectionner le client la commande client");
            return errors;

        }

        if (!StringUtils.hasLength(commandeClientDto.getCode())){
            errors.add("Veuillez Renseigner le code de la commande client");
        }
        if (commandeClientDto.getDateCommande() == null){
            errors.add("Veuillez Renseigner la date de la commande client");
        }
        if (commandeClientDto.getEtatCommande() == null){
            errors.add("Veuillez Selectionner l'Etat de la commande client");
        }
        if (commandeClientDto.getClient() == null){
            errors.add("Veuillez Selectionner le client la commande client");
        }
        return errors;


    }
}
