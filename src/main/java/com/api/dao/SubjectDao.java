package com.api.dao;

import java.util.ArrayList;

import com.api.entity.Subject;

public class SubjectDao {
	public ArrayList<Subject> getAllSubject(){
		ArrayList<Subject> list=new ArrayList<Subject>();
		list.add(new Subject(1,"math"));
		list.add(new Subject(2,"English"));
		return list;

	}
}