package com.babahamou.stockmanagement.exception;

public enum ErrorCode {
    ARTICLE_NOT_FOUND(1000),
    CATEGORY_NOT_FOUND(2000),
    CLEINT_NOT_FOUND(3000),
    COMMANDE_CLIENT_NOT_FOUND(4000),
    COMMANDE_FOURNISSEUR_NOT_FOUND(5000),
    ENTREPRISE_NOT_FOUND(6000),
    FOURNISSEUR_NOT_FOUND(7000),
    LIGNE_CMD_CLIENT_NOT_FOUND(8000),
    LIGNE_CMD_FOURNISSEUR_NOT_FOUND(9000),
    LIGNE_VENTE_NOT_FOUND(10000),
    MOUVEMENT_STOCK_NOT_FOUND(11000),
    UTILISATEUR_NOT_FOUND(12000),
    VENTE_NOT_FOUND(13000),
    ;
    private int code;
    ErrorCode(int code){
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
