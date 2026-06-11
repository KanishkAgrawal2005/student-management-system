package com.example.myProject.repository;

import com.example.myProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
        extends JpaRepository<Student, Integer> {

}