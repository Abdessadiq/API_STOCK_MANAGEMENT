package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter @Setter
@Builder
public class CategoryDto {
    private Integer id;
    private String code;
    private String designation;
    private Integer idEntreprise;

    @JsonIgnore
    private List<ArticleDto> articles;

    public static CategoryDto fromEntity(Category category){
        if (category == null){
            return  null;
            // TODO throw An exeption..
        }
       return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .idEntreprise(category.getIdEntreprise())
                .build();

    }

    public static Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return  null;
            // TODO throw An exeption..
        }
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setIdEntreprise((categoryDto.getIdEntreprise()));
        category.setDesignation(categoryDto.getDesignation());
        return category;

    }
}
