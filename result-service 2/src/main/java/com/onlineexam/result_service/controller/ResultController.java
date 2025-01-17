package com.onlineexam.result_service.controller;

import com.onlineexam.result_service.model.Result;
import com.onlineexam.result_service.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultController {
    @Autowired
    private ResultRepository repository;

    @GetMapping
    public List<Result> getAllResults() {
        return repository.findAll();
    }

    @PostMapping
    public Result saveResult(@RequestBody Result result) {
        return repository.save(result);
    }

    @GetMapping("/student/{studentId}")
    public List<Result> getResultsByStudentId(@PathVariable Long studentId) {
        return repository.findAll()
                .stream()
                .filter(result -> result.getStudentId().equals(studentId))
                .toList();
    }
}
