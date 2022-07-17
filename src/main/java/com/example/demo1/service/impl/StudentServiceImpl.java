package com.example.demo1.service.impl;

import com.example.demo1.model.Student;
import com.example.demo1.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    //overriding methods
    @Override
    public List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("chamith","CS/2018/023","cl1@gmail.com",23,"ambalangoda"));
        studentList.add(new Student("chamith2","CS/2018/123","kp@gmail.com",34,"Alawwa"));
        studentList.add(new Student("chamith3","CS/2018/223","cl3@gmail.com",25,"colombo"));
        studentList.add(new Student("chamith4","CS/2018/323","cl4@gmail.com",23,"gampaha"));
        return studentList;
    }

    @Override
    public Student addStudent(Student student){
        return student;
    }
}
