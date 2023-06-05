package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleVallidator {

    public List<String> validate(ArticleDto articleDto){
        List<String> errors = new ArrayList<>();
        if (articleDto == null){

        }
        if (!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("Veuiller renseinger La designation de l'article");
        }

        if (articleDto.getPrixUnitaireHt() == null){
            errors.add("Veuiller renseinger Le prix unitaire HT de l'article");
        }

        if (articleDto.getPrixUnitaireTtc() == null){
            errors.add("Veuiller renseinger Le prix unitaire TTC de l'article");
        }
        if (articleDto.getTauxTva() == null){
            errors.add("Veuiller renseinger Le TVA de l'article");
        }
        if (articleDto.getCategory() == null){
            errors.add("Veuiller Sélectionner une categorie de l'article");
        }
        return errors;
    }
}
