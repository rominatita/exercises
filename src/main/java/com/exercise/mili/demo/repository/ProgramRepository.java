package com.exercise.mili.demo.repository;

import com.exercise.mili.demo.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ProgramRepository extends JpaRepository<Program, Long> {
    }

