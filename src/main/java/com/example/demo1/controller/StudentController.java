package com.example.demo1.controller;

import com.example.demo1.model.Student;
import com.example.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/student-details") //Get method request
    public ResponseEntity<List<Student>> studentDetails(){

       List<Student> studentList = studentService.getStudent();

        if(studentList.isEmpty()){
            return new ResponseEntity<>(studentList, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    //Post method request
    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student newStudent){

        return studentService.addStudent(newStudent);


    }


}
