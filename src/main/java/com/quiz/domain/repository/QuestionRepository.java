package com.quiz.domain.repository;

import com.quiz.domain.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository {
    List<Question> getAll();
    Optional<List<Question>> getByCategory (int categoryId);
    Optional<Question> getQuestion(int questionId);
    Question save(Question question);
    void delete(int questionId);
}
