package com.quiz.persistence.mapper;

import com.quiz.domain.Question;
import com.quiz.persistence.entity.Pregunta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper(componentModel = "spring" , uses = {CategoryMapper.class})
public interface QuestionMapper {
    @Mappings({
            @Mapping(source = "idPregunta", target = "questionId" ),
            @Mapping(source = "descripcion", target = "description" ),
            @Mapping(source = "idCategoria", target = "categoryId" ),
            @Mapping(source = "respuestaCorrecta", target = "correctAnswer" ),
            @Mapping(source = "puntosDados", target = "points" ),
            @Mapping(source = "categoria", target = "category" ),

    })

    Question toQuestion(Pregunta pregunta);
    List<Question> toQuestions(List<Pregunta> preguntas);

    @InheritInverseConfiguration
    Pregunta toPregunta(Question question);
}
