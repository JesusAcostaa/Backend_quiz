package com.quiz.domain.service;

import com.quiz.domain.Question;
import com.quiz.domain.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAll() {
        return  questionRepository.getAll();
    }

    public Optional<Question> getQuestion(int questionId){
        return questionRepository.getQuestion(questionId);
    }

    public Optional<List<Question>> getByCategory(int categoryId){
        return  questionRepository.getByCategory(categoryId);
    }

    public Question save(Question question){
        return questionRepository.save(question);
    }

    public boolean delete(int questionId){
        return getQuestion(questionId).map(question -> {
            questionRepository.delete(questionId);
            return true;
        }).orElse(false);
    }
}
