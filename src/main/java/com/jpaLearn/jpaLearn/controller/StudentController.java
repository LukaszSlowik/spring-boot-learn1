package com.jpaLearn.jpaLearn.controller;

import com.jpaLearn.jpaLearn.model.Student;
import com.jpaLearn.jpaLearn.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {
  private final StudentService service;


    @GetMapping("")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }
    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email)
    {
        return service.findByEmail(email);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.update(student);
    }
    @DeleteMapping("{email}")
    public void delete(@PathVariable String email){
        service.deleteStudent(email);
    }
}

//test