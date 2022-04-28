package com.quiz.persistence.crud;

import com.quiz.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaCrudrepository extends CrudRepository<Categoria, Integer> {

    List<Categoria> findById(int idCategoria);
}
