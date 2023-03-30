package com.example.students_tests.controllers;

import com.example.students_tests.models.User;
import com.example.students_tests.services.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserSerivce userSerivce;

    @GetMapping("")
    public List<User> allUsers() {
        return userSerivce.getAllUsers();
    }
    @GetMapping("/teachers")
    public List<User> onlyTeachers() {
        return userSerivce.getOnlyTeachers();
    }
    @GetMapping("/students")
    public List<User> onlyStudents() {
        return userSerivce.getOnlyStudents();
    }

}
