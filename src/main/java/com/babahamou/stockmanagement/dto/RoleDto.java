package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter @Setter
@Builder
public class RoleDto {
    private Integer id;
    private String roleName;
    @JsonIgnore
    private UtilisateurDto utilisateur;

    public static RoleDto fromEntity(Role role){
        if (role == null){
            return null;
        }
        return RoleDto.builder()
                .id(role.getId())
                .roleName(role.getRoleName())
                .build();
    }

    public static Role toEntity(RoleDto roleDto){
        if (roleDto == null){
            return  null;
        }
        Role role = new Role();
        role.setId(roleDto.getId());
        role.setRoleName(roleDto.getRoleName());
        return role;
    }

}
