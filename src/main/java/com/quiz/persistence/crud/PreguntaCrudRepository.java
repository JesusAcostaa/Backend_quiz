package com.quiz.persistence.crud;

import com.quiz.persistence.entity.Pregunta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PreguntaCrudRepository extends CrudRepository<Pregunta, Integer> {

    List<Pregunta> findByIdCategoria(int idCategoria);

    Optional<List<Pregunta>> findByIdPregunta(int idPregunta);

}


