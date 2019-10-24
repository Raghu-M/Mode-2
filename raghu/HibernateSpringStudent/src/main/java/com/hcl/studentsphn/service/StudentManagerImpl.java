package com.hcl.studentsphn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.studentsphn.dao.StudentDAOImpl;
import com.hcl.studentsphn.model.Student;

@Service
public class StudentManagerImpl implements StudentManager{

	@Autowired
	StudentDAOImpl dao;
	
	public String addStudent(Student student) {
		return new StudentDAOImpl().addStudent(student);
	}

	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student searchStudent(int RollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteStudent(int RollNo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
