package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.TypeMouvement;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;


@Getter @Setter
@Builder
public class MouvementStockDto  {
    private  Integer id;
    private Instant dateMouvement;
    private BigDecimal quantite;
    private ArticleDto article;
    private TypeMouvement typeMouvement;


}
