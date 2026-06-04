package com.example.myProject.controller;

import com.example.myProject.model.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {

    @GetMapping
    public Student getStudent() {

        return new Student(1L, "Kanishk", "kanishk20042018@gmail.com");
    }
}