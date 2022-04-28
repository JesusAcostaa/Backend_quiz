package com.quiz.persistence.mapper;

import com.quiz.domain.Category;
import com.quiz.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "nombreCategoria", target = "categoryName"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);
    List<Category> toCategorys(List<Categoria> categorias);

    @InheritInverseConfiguration
    @Mapping(target = "preguntas" , ignore = true)
    Categoria toCategoria(Category category);
}
