package com.example.students_tests.repository;

import com.example.students_tests.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUsersByRoleId(Integer roleId);
}
