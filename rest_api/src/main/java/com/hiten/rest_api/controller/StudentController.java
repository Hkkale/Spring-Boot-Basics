package com.hiten.rest_api.controller;


import com.hiten.rest_api.model.Student;
import com.hiten.rest_api.response.StudentResponse;
import com.hiten.rest_api.response.StudentRuntimeException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {

    List<Student> students;



    @PostConstruct
    public void addData(){
         students=Arrays.asList(new Student("Bala","Kale"),new Student("Hitendra","Kale"),
                new Student("Anshul","Kale"),new Student("Sonal","Kale"),new Student("Nitika","Kale"));

    }


    @GetMapping("students")
    public List<Student> getStudents(){
        return this.students;
    }

    @GetMapping("students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        if(studentId>=students.size() || studentId<0){
            throw new StudentRuntimeException("Invalid student id: "+ studentId);
        }
        return this.students.get(studentId);
    }










}
