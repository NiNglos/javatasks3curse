package com.example.students_tests.repository;

import com.example.students_tests.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Answer findAnswerByRowId(Integer rowId);
}
