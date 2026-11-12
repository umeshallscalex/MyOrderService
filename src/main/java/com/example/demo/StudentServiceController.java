package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentServiceController {

    @Autowired
    StudentService studentService;
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/add")
    public List<Student> addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return getAllStudents();
    }
}
