package com.onlineexam.student_service.controller;

import com.onlineexam.student_service.model.Student;
import com.onlineexam.student_service.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @PostMapping
    public Student registerStudent(@RequestBody Student student) {
        return repository.save(student);
    }
}
