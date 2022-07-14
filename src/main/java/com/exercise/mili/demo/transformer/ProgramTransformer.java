package com.exercise.mili.demo.transformer;

import com.exercise.mili.demo.dto.ProgramDto;
import com.exercise.mili.demo.entity.Program;

import java.util.function.Function;

public class ProgramTransformer implements Function<Program, ProgramDto> {

    @Override
    public ProgramDto apply(Program entity) {
        ProgramDto programDto = new ProgramDto();
        programDto.setId(entity.getId());
        programDto.setDescription(entity.getDescription());
        return programDto;
    }
}
