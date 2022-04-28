package com.quiz.domain.repository;

import com.quiz.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository{

    Optional<List<Category>> getById(int categoryId);
}
