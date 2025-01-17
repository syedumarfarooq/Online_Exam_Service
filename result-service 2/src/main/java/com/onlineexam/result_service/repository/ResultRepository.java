package com.onlineexam.result_service.repository;

import com.onlineexam.result_service.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, Long> {}
