package com.quiz.web.controller;

import com.quiz.domain.Question;
import com.quiz.domain.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/preguntas")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/allQuestion")
    public List<Question> getAll(){
        return questionService.getAll();
    }

    public Optional<Question> getQuestion(int questionId){
        return questionService.getQuestion(questionId);
    }

    public Optional<List<Question>> getByCategory(int categoryId){
        return questionService.getByCategory(categoryId);
    }

    public Question saver(Question question){
        return  questionService.save(question);
    }

    public boolean delete(int questionId){
        return questionService.delete(questionId);
    }

}
