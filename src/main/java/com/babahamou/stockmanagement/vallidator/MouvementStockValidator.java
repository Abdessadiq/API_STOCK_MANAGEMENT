package com.babahamou.stockmanagement.vallidator;

import com.babahamou.stockmanagement.dto.MouvementStockDto;

import java.util.ArrayList;
import java.util.List;

public class MouvementStockValidator {
    public static List<String> validate(MouvementStockDto mouvementStockDto){
        List<String>  errors = new ArrayList<>();
        if (mouvementStockDto == null){

            errors.add("Veuillez Renseigner La quantité");
            errors.add("Veuillez Renseigner La date");
            errors.add("Veuillez Séléctionne Type de Mouvement Stock");
            errors.add("Veuillez Selectionner Source de mouvement Stock");
            errors.add("Veuillez Séléctionner l'article");
            return  errors;
        }

        if (mouvementStockDto.getQuantite() == null){
            errors.add("Veuillez Renseigner La quantité");
        }
        if (mouvementStockDto.getDateMouvement() == null){
            errors.add("Veuillez Renseigner La date !");
        }
        if (mouvementStockDto.getTypeMouvement() == null){
            errors.add("Veuillez Séléctionne Type de mouvement Stock");
        }
        if (mouvementStockDto.getSourceMouvementStock() == null){
            errors.add("Veuillez Selectionner Source de mouvement Stock");
        }
        if (mouvementStockDto.getArticle() == null){
            errors.add("Veuillez Séléctionner l'article !");
        }



        return errors;
    }
}
