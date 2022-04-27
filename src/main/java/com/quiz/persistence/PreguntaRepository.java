package com.quiz.persistence;

import com.quiz.domain.Question;
import com.quiz.domain.repository.QuestionRepository;
import com.quiz.persistence.crud.PreguntaCrudRepository;
import com.quiz.persistence.entity.Pregunta;
import com.quiz.persistence.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PreguntaRepository implements QuestionRepository {
    @Autowired
    private PreguntaCrudRepository preguntaCrudRepository;

    @Autowired
    private QuestionMapper mapper;

    @Override
    public List<Question> getAll(){
       List<Pregunta> preguntas = (List<Pregunta>) preguntaCrudRepository.findAll();
       return  mapper.toQuestions(preguntas);
    }

    @Override
    public Optional<List<Question>> getByCategory(int categoryId) {
        List<Pregunta> preguntas = preguntaCrudRepository.findByIdCategoria(categoryId);
        return Optional.of(mapper.toQuestions(preguntas));
    }

    @Override
    public Optional<Question> getQuestion(int questionId) {

        return preguntaCrudRepository.findById(questionId).map(pregunta -> mapper.toQuestion(pregunta));
    }

    @Override
    public Question save(Question question) {
        Pregunta pregunta = mapper.toPregunta(question);
        return mapper.toQuestion(preguntaCrudRepository.save(pregunta));
    }

    @Override
    public void delete(int idPregunta){
        preguntaCrudRepository.deleteById(idPregunta);
    }

    public List<Pregunta> getByCategoria(int idCategoria){
        return preguntaCrudRepository.findByIdCategoria(idCategoria);
    }
}
