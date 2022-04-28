package com.quiz.persistence;

import com.quiz.domain.Category;
import com.quiz.domain.repository.CategoryRepository;
import com.quiz.persistence.crud.CategoriaCrudrepository;
import com.quiz.persistence.entity.Categoria;
import com.quiz.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository implements CategoryRepository {

    @Autowired
    private CategoriaCrudrepository categoriaCrudrepository;

    @Autowired
    private CategoryMapper mapper;

    @Override
    public Optional<List<Category>> getById(int categoryId) {
        List<Categoria> categorias =  categoriaCrudrepository.findById(categoryId);
        return Optional.of(mapper.toCategorys(categorias));
    }
}
