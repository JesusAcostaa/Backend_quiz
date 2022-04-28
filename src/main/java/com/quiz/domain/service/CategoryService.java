package com.quiz.domain.service;

import com.quiz.domain.Category;
import com.quiz.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Optional<List<Category>> getCategory(int categoryId){
        return categoryRepository.getById(categoryId);
    }


}
