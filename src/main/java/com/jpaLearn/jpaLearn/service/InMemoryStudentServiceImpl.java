package com.jpaLearn.jpaLearn.service;

import com.jpaLearn.jpaLearn.Dao.InMemoryStudentDao;
import com.jpaLearn.jpaLearn.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDao inMemoryStudentDao;

    @Override
    public Student save(Student s) {
        return inMemoryStudentDao.save(s);
    }

    @Override
    public List<Student> getStudents(){
        return inMemoryStudentDao.getStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return inMemoryStudentDao.update(s);
    }

    @Override
    public void deleteStudent(String email) {
        inMemoryStudentDao.deleteStudent(email);

    }
}


