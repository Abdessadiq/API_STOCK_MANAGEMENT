package com.babahamou.stockmanagement.dto;
import lombok.*;
import java.time.Instant;
import java.util.List;
@Getter @Setter
@Builder

public class CommandeClientDto {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private ClientDto client;
    private List<LigneCmdClientDto> ligneCmdClients;

}
