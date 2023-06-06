package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.ClientDto;
import com.babahamou.stockmanagement.model.Client;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDto clientDto){
        List<String> errors = new ArrayList<>();

        if (clientDto == null){

            errors.add("Veuillez Renseinger Le nom de client !");
            errors.add("Veuillez Renseinger Le Prenom de client !");
            errors.add("Veuillez Renseinger L'email de client !");
            errors.add("Veuillez Renseinger Le Num de telephone de client !");
            return  errors;
        }
        if (!StringUtils.hasLength(clientDto.getNom())){
            errors.add("Veuillez Renseinger Le nom de client !");
        }
        if (!StringUtils.hasLength(clientDto.getPrenom())){
            errors.add("Veuillez Renseinger Le Prenom de client !");
        }
        if (!StringUtils.hasLength(clientDto.getMail())){
            errors.add("Veuillez Renseinger L'email de client !");
        }
        if (!StringUtils.hasLength(clientDto.getNumTel())){
            errors.add("Veuillez Renseinger Le Num de telephone de client !");
        }

        return errors;
    }
}
