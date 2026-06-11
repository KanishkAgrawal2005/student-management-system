package com.example.myProject.controller;

import com.example.myProject.model.Student;
import com.example.myProject.service.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
    return service.saveStudent(student);
    }
}