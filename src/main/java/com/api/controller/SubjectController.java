package com.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Subject;
import com.api.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	SubjectService service;
	
	 @PostMapping("/create")
	    public String addSubject(@RequestBody Subject subject) 
	 {
	       
	        return "Subject create: " + subject.getSubjectName();
	 }
	
	
	@GetMapping("/getAllSubject")
	public ArrayList<Subject> getAllSubject(){
		ArrayList<Subject> list=new ArrayList<Subject>();
		return list;
	
	
	}
}
