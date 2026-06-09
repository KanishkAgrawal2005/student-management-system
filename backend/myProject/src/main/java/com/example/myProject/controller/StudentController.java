package com.example.myProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/count")
    public Integer countStudents() {
        String sql = "SELECT COUNT(*) FROM students";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
}