package com.api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.dao.StudentDao;
import com.api.entity.Student;



public class StudentServices {
	@Autowired
	StudentDao dao;
	public ArrayList<Student> getAllStudent(){
		ArrayList<Student> plist=dao.getAllStudent();
		return plist;
	
	}	
}
