package com.jpaLearn.jpaLearn.Dao;

import com.jpaLearn.jpaLearn.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {
    private final List<Student> STUDENTS = new ArrayList<>(
    );

    public Student save(Student s) {
        STUDENTS.add(s);
        return s;
    }


    public List<Student> getStudents(){
        return STUDENTS;
    }


    public Student findByEmail(String email) {
        return STUDENTS.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    public Student update(Student s) {
        int studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(i -> STUDENTS.get(i).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex != -1){
            STUDENTS.set(studentIndex, s);
            return s;
        }


        return s;
    }



    public void deleteStudent(String email) {
        Student student = findByEmail(email);
        if(student != null){
            STUDENTS.remove(student);
        }

    }
}
