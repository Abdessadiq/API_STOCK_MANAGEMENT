package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.RoleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RoleValidator {

    public static List<String> validate(RoleDto roleDto){
         List<String> errors = new ArrayList<>();
        if (roleDto == null){
            errors.add("Veuillez Renseigner Le rolename !");
            errors.add("Veuillez Séléctionner l'utilisateur ! ");
            return errors;
        }
        if (!StringUtils.hasLength(roleDto.getRoleName())){
            errors.add("Veuillez Renseigner Le rolename");
        }
        if (roleDto.getUtilisateur() == null){
            errors.add("Veuillez Séléctionner l'utilisateur ! ");
        }
         return errors;
    }
}
