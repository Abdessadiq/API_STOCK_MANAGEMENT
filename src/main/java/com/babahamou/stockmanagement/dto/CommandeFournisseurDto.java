package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.CommandeFournisseur;
import lombok.*;
import java.time.Instant;
import java.util.List;
@Getter @Setter
@Builder

public class CommandeFournisseurDto  {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private FournisseurDto fournisseur;
    private Integer idEntreprise;

    private List<LigneCmdFournisseurDto> ligneCmdFournisseurs;

    public CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
        if (commandeFournisseur == null){
            return null;
        }
         return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                 .idEntreprise(commandeFournisseur.getIdEntreprise())
                 .fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
                .build();

    }
    public CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto){
        if (commandeFournisseurDto  == null){
            return null;
        }
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        commandeFournisseur.setIdEntreprise(commandeFournisseurDto.getIdEntreprise());
        commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
        commandeFournisseur.setFournisseur(FournisseurDto.toEntity(commandeFournisseurDto.getFournisseur()));
        return  commandeFournisseur;
    }

}
