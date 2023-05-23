package com.babahamou.stockmanagement.dto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Builder
@Getter @Setter
public class CategoryDto {
    private Integer id;
    private String code;
    private String disignation;
    private List<ArticleDto> articles;
}
