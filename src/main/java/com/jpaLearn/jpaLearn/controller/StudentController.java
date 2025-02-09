package com.jpaLearn.jpaLearn.controller;

import com.jpaLearn.jpaLearn.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
                new Student("John", "Doe", 20, "john.doe@example.com", LocalDate.of(2003, 1, 1)),
                new Student("Jane", "Smith", 22, "jane.smith@example.com", LocalDate.of(2001, 2, 2)),
                new Student("Michael", "Johnson", 21, "michael.johnson@example.com", LocalDate.of(2002, 3, 3)),
                new Student("Emily", "Davis", 23, "emily.davis@example.com", LocalDate.of(2000, 4, 4)),
                new Student("David", "Wilson", 24, "david.wilson@example.com", LocalDate.of(1999, 5, 5)),
                new Student("Sarah", "Brown", 25, "sarah.brown@example.com", LocalDate.of(1998, 6, 6)),
                new Student("Chris", "Jones", 26, "chris.jones@example.com", LocalDate.of(1997, 7, 7)),
                new Student("Jessica", "Garcia", 27, "jessica.garcia@example.com", LocalDate.of(1996, 8, 8)),
                new Student("Daniel", "Martinez", 28, "daniel.martinez@example.com", LocalDate.of(1995, 9, 9)),
                new Student("Laura", "Hernandez", 29, "laura.hernandez@example.com", LocalDate.of(1994, 10, 10))

        );
    }
}
//test