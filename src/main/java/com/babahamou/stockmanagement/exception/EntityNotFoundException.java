package com.babahamou.stockmanagement.exception;

import lombok.Getter;

/**
 * L'exception qui va être enlever lorsque on essaie de chercher quelque choses dans la
 * Base de donnée Mais on le trouve pas ..
 */

public class EntityNotFoundException extends RuntimeException{

    @Getter
    private ErrorCode errorCode;

    public EntityNotFoundException(String message){
        super(message);
    }
    public EntityNotFoundException(String message, Throwable cause ){
        super(message, cause);
    }
    public EntityNotFoundException(String message, Throwable cause, ErrorCode errorCode ){
        super(message, cause);
        this.errorCode =   errorCode;
    }
    public EntityNotFoundException(String message, ErrorCode  errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
