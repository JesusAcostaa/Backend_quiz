package com.quiz.persistence;

import com.quiz.persistence.crud.PreguntaCrudRepository;
import com.quiz.persistence.entity.Pregunta;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PreguntaRepository {

    private PreguntaCrudRepository preguntaCrudRepository;

    public List<Pregunta> getAll(){
        return (List<Pregunta>) preguntaCrudRepository.findAll();
    }

    public List<Pregunta> getByCategoria(int idCategoria){
        return preguntaCrudRepository.findByIdCategoria(idCategoria);
    }

    public Optional<List<Pregunta>> getPregunta(int idPregunta){
        return preguntaCrudRepository.findByIdPregunta(idPregunta);
    }

    public Pregunta save(Pregunta pregunta){
        return preguntaCrudRepository.save(pregunta);
    }

    public void delete(int idPregunta){
        preguntaCrudRepository.deleteById(idPregunta);
    }
}
