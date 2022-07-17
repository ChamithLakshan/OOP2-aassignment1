package com.example.demo1.service;

import com.example.demo1.model.Student;

import java.util.List;

public interface StudentService {

    List<Student>getStudent(); // get student method
    Student addStudent(Student student); // add student method
}
