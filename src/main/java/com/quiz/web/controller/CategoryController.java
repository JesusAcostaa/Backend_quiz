package com.quiz.web.controller;

import com.quiz.domain.Category;
import com.quiz.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categoria/{id}")
    public Optional<List<Category>> getCategory(@PathVariable("id") int categoryId){
        return categoryService.getCategory(categoryId);
    }
}
