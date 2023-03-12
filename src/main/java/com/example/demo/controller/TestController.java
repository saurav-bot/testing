package com.example.demo.controller;

import com.example.demo.Dto.Student;
import com.example.demo.Dto.StudentRequest;
import com.example.demo.services.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    studentService studentService;

    //Student - get post
    @GetMapping("/student")
    public Student getStudent() throws ClassNotFoundException {
        //format
        return studentService.getStudent();
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody StudentRequest student) {

        return studentService.create(student);
    }
}
