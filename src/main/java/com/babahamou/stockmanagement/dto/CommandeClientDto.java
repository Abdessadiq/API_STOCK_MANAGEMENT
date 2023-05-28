package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.CommandeClient;
import com.babahamou.stockmanagement.model.EtatCommande;
import lombok.*;
import java.time.Instant;
import java.util.List;
@Getter @Setter
@Builder

public class CommandeClientDto {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private EtatCommande etatCommande;
    private Integer idEntreprise;
    private ClientDto client;
    private List<LigneCmdClientDto> ligneCmdClients;

    /**
     *
     * @param commandeClient
     * @return
     */

    public static CommandeClientDto fromEntity(CommandeClient commandeClient){
        if (commandeClient == null){
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .etatCommande(commandeClient.getEtatCommande())
                .idEntreprise(commandeClient.getIdEntreprise())
                .dateCommande(commandeClient.getDateCommande())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
                .build();
    }
    public static CommandeClient toEntity(CommandeClientDto commandeClientDto){
        if (commandeClientDto == null){
            return null;
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setEtatCommande(commandeClientDto.getEtatCommande());
        commandeClient.setIdEntreprise(commandeClientDto.getIdEntreprise());
        commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        return commandeClient;
    }


}
