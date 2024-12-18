package com.api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.dao.SubjectDao;
import com.api.entity.Subject;


public class SubjectService {
	@Autowired
	SubjectDao dao;
	public ArrayList<Subject> getAllSubject(){
		ArrayList<Subject> plist=dao.getAllSubject();
		return plist;
	
	}	
}
