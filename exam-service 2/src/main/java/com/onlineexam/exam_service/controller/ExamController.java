package com.onlineexam.exam_service.controller;

import com.onlineexam.exam_service.model.Exam;
import com.onlineexam.exam_service.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exams")
public class ExamController {
    @Autowired
    private ExamRepository repository;

    @GetMapping
    public List<Exam> getAllExams() {
        return repository.findAll();
    }

    @PostMapping
    public Exam createExam(@RequestBody Exam exam) {
        return repository.save(exam);
    }
}
