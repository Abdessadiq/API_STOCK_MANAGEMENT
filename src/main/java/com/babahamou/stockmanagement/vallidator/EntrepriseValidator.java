package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {
    public List<String> validate(EntrepriseDto entrepriseDto){
        List<String> errors = new ArrayList<>();
        if (entrepriseDto == null) {

            errors.add("Veuillez Renseinger Le nom de L'entreprise !");
            errors.add("Veuillez Renseinger Le Description de L'entreprise !");
            errors.add("Veuillez Renseinger L'email de L'entreprise !");
            errors.add("Veuillez Renseinger Le Num de telephone de L'entreprise !");
            errors.add("Veuillez Renseigner l'adresse de l'entreprise  !");
            return errors;
        }
        if (!StringUtils.hasLength(entrepriseDto.getNom())) {
            errors.add("Veuillez Renseinger Le nom de L'entreprise !");
        }
        if (!StringUtils.hasLength(entrepriseDto.getDescription())) {
            errors.add("Veuillez Renseinger La description de L'entreprise !");
        }
        if (!StringUtils.hasLength(entrepriseDto.getMail())) {
            errors.add("Veuillez Renseinger L'email de L'entreprise !");
        }
        if (!StringUtils.hasLength(entrepriseDto.getNumTel())) {
            errors.add("Veuillez Renseinger Le Num de telephone de L'entreprise !");
        }
        if (!StringUtils.hasLength(entrepriseDto.getCodeFiscal())) {
            errors.add("Veuillez Renseinger Le code Fiscal de L'entreprise !");
        }
        if (entrepriseDto.getAdresse() == null){
            errors.add("Veuillez Renseigner l'adresse de l'entreprise  !");
        }else{
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getAdress1())){
                errors.add("Adresse 1 est Oblégatoire !");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getVille())){
                errors.add("La ville est Oblégatoire !");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getCodePostal())){
                errors.add("Le code Postal est Oblégatoire !");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getPays())){
                errors.add("pays est Oblégatoire !");
            }
        }

        return errors;
    }
}
