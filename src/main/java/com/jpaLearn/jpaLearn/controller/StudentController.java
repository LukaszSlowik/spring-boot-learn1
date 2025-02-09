package com.jpaLearn.jpaLearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @GetMapping
    public List<String> findAllStudents(){
        return List.of("Lukasz", "Marek");
    }
}
//test