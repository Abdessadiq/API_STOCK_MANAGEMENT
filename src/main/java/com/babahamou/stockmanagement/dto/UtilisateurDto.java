package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.AbstractEntity;
import com.babahamou.stockmanagement.model.Adresse;
import com.babahamou.stockmanagement.model.Entreprise;
import com.babahamou.stockmanagement.model.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;


@Getter @Setter
@Builder

public class UtilisateurDto {
    private Integer Id;
    private String nom;
    private String prenom;
    private Instant dateNaissance;
    private AdresseDto adresse;
    private String motDePasse;
    private String mail;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;

}
