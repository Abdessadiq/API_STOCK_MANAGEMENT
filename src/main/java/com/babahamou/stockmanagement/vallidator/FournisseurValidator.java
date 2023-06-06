package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.ClientDto;
import com.babahamou.stockmanagement.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {
    public static List<String> validate(FournisseurDto fournisseurDto) {
        List<String> errors = new ArrayList<>();

        if (fournisseurDto == null) {

            errors.add("Veuillez Renseinger Le nom de Fournisseur !");
            errors.add("Veuillez Renseinger Le Prenom de Fournisseur !");
            errors.add("Veuillez Renseinger L'email de Fournisseur !");
            errors.add("Veuillez Renseinger Le Num de telephone de Fournisseur !");
            return errors;
        }
        if (!StringUtils.hasLength(fournisseurDto.getNom())) {
            errors.add("Veuillez Renseinger Le nom de Fournisseur !");
        }
        if (!StringUtils.hasLength(fournisseurDto.getPrenom())) {
            errors.add("Veuillez Renseinger Le Prenom de Fournisseur !");
        }
        if (!StringUtils.hasLength(fournisseurDto.getMail())) {
            errors.add("Veuillez Renseinger L'email de Fournisseur !");
        }
        if (!StringUtils.hasLength(fournisseurDto.getNumTel())) {
            errors.add("Veuillez Renseinger Le Num de telephone de Fournisseur !");
        }

        return errors;
    }
}
