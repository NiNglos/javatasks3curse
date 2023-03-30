package com.example.students_tests.repository;

import com.example.students_tests.models.TestList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestListRepository extends JpaRepository<TestList, Integer> {
    TestList findTestListByRowId(Integer rowId);
}
