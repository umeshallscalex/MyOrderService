package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentJpaRepository studentJpaRepository;
    public List<Student> getAllStudents() {
        return studentJpaRepository.findAll();
    }

    public List<Student> saveStudent(Student student) {
        studentJpaRepository.save(student);
        return getAllStudents();
    }
}
