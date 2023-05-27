package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.Adresse;
import lombok.*;

@Getter @Setter
@Builder
public class AdresseDto {
    private String adress1;
    private String adress2;
    private String ville;
    private String codePostal;
    private String pays;

    /**
     * La manipulation des DTO Date Transfer Object
     * @param adresse
     * @return AdresseDto From Entity
     */

    public static AdresseDto fromEntity(Adresse adresse){
        if (adresse == null){
            return null;
            // TODO throw Exception
        }
        return AdresseDto.builder()
                .adress1(adresse.getAdress1())
                .adress2(adresse.getAdress2())
                .codePostal(adresse.getCodePostal())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();
    }
    public static Adresse toEntity(AdresseDto adresseDto){
        if (adresseDto == null){
            return null;
            // TODO the new throw exception
        }
        Adresse adresse = new Adresse();
        adresse.setAdress1(adresseDto.adress1);
        adresse.setAdress2(adresseDto.adress2);
        adresse.setPays(adresseDto.pays);
        adresse.setVille(adresseDto.ville);
        adresse.setCodePostal(adresseDto.codePostal);
        return adresse;
    }

}
