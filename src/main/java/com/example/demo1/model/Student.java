package com.example.demo1.model;


import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //No argument Public constructor
    public Student(){}

    //constructor
    public Student(String studentName, String studentNumber, String email, int age, String city) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.email = email;
        this.age = age;
        this.city = city;
    }

    @NotBlank    // validations
    private String studentName;
    @NotBlank
    private String studentNumber;
    @Email
    private String email;
    @NotEmpty
    private int age;
    @NotBlank
    private  String city;


    //Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Id
    public Long getId() {
        return id;
    }
}
