package com.babahamou.stockmanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Getter @Setter
@Entity
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Category extends AbstractEntity {
    private String code;
    private String designation;
    private Integer idEntreprise;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;


}
