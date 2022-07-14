package com.exercise.mili.demo.service.imp;

import com.exercise.mili.demo.dto.ProgramDto;
import com.exercise.mili.demo.repository.ProgramRepository;
import com.exercise.mili.demo.service.ProgramService;
import com.exercise.mili.demo.transformer.ProgramTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProgramServiceImplement implements ProgramService {

    private ProgramRepository programRepository;

    private ProgramTransformer programTransformer;

    @Autowired
    public void setProgramRepository(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public List<ProgramDto> getAllProgram() {
        return null;
    }
}
