package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryVallidator {

    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors = new ArrayList<>();
        if (categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())){
            errors.add("Veuillez Renseigner Le Code de Catégorie .. ");
        }
        return errors;
    }
}
