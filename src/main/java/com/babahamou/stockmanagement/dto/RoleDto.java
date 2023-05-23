package com.babahamou.stockmanagement.dto;
import lombok.*;

@Getter @Setter
@Builder
public class RoleDto {
    private Integer id;
    private String roleName;
    private UtilisateurDto utilisateur;

}
