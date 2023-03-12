package com.example.demo.services;

import com.example.demo.Dto.Student;
import com.example.demo.Dto.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class studentService {

    private Student student = new Student();

    public Student create(StudentRequest studentreq) {
        student.setAge(studentreq.getAge());
        student.setName(studentreq.getName());
        student.setRollno(studentreq.getRollno());

        return student;
    }

    public Student getStudent() throws ClassNotFoundException {
        if (Objects.isNull(student.getName())) {
            throw new ClassNotFoundException();
        }

        return student;

    }
}
