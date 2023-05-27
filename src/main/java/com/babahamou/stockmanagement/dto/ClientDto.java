package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.Adresse;
import com.babahamou.stockmanagement.model.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import java.util.List;

@Getter @Setter
@Builder
public class ClientDto  {
    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String numTel;
    private String mail;
    private String photo;
    private Integer idEntreprise;
    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client){
        if (client == null){
            return  null;
            // TODO The Exception
        }
        return  ClientDto.builder()
                .id(client.getId())
                 .adresse(AdresseDto.fromEntity(client.getAdresse()))
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .photo(client.getPhoto())
                .idEntreprise(client.getIdEntreprise())
                .build();
    }
    public static Client toEntity(ClientDto clientDto){
        if (clientDto == null){
            return null;
            // TODO The Exception
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom() );
        client.setPrenom(clientDto.getPrenom());
        client.setMail(clientDto.getMail());
        client.setAdresse(AdresseDto.toEntity(clientDto.getAdresse()));
        client.setNumTel(clientDto.getNumTel());
        client.setPhoto(clientDto.getPhoto());

        return client;
    }


}