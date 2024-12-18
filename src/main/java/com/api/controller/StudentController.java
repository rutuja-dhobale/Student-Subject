package com.api.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Student;
import com.api.entity.Subject;
import com.api.entity.User;
import com.api.service.StudentServices;
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentServices services;
	
	 @PostMapping("/create")
	    public String addStudent(@RequestBody Student student) 
	 {
        return "Student create: " + student.getStudentName() + student.getStudentId();
	 }
	  
	@GetMapping("/GetAllStudent")
	public ArrayList<Student> getAllStudent(){	
    ArrayList<Student> list=services.getAllStudent();
    return list;
	}
	}

