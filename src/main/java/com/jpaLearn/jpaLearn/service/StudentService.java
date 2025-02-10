package com.jpaLearn.jpaLearn.service;

import com.jpaLearn.jpaLearn.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {
    Student save(Student s);
    List<Student> getStudents();
    Student findByEmail(String email);
    Student update(Student s);
    void deleteStudent(String email);
}