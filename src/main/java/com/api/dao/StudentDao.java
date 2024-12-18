package com.api.dao;

import java.util.ArrayList;

import com.api.entity.Student;
import com.api.entity.Subject;


public class StudentDao {
	public ArrayList<Student> getAllStudent(){
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"ram","Pune"));
		list.add(new Student(2,"rutuja","amravati"));
		return list;
}
}