package com.exercise.mili.demo.controller;

import com.exercise.mili.demo.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/")
public class Controller {

    private ProgramService programService;

    @Autowired
    public void setProgramService(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping("/h2-console")
    public ProgramService getProgramService() {
        return programService;
    }
}
