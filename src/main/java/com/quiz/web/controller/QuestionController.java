package com.quiz.web.controller;

import com.quiz.domain.Question;
import com.quiz.domain.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/question/{questionId}")
    public Optional<Question> getQuestion(@PathVariable("questionId") int questionId){
        return questionService.getQuestion(questionId);
    }

    @GetMapping("/categoria/{id}")
    public Optional<List<Question>> getByCategory(@PathVariable("id") int categoryId){
        return questionService.getByCategory(categoryId);
    }

    @PostMapping("/save")
    public Question save(@RequestBody Question question){
        return  questionService.save(question);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int questionId){
        return questionService.delete(questionId);
    }

}
