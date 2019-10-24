package com.hcl.studentsphn.dao;

import com.hcl.studentsphn.model.Student;

public interface StudentDAO {
	String addStudent(Student student);
	String updateStudent(Student student);
	Student searchStudent(int RollNo);
	String deleteStudent(int RollNo);
	
}
