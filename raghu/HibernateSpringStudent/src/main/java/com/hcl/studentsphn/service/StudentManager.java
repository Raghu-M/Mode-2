package com.hcl.studentsphn.service;

import com.hcl.studentsphn.model.Student;

public interface StudentManager {
	
	String addStudent(Student student);
	String updateStudent(Student student);
	Student searchStudent(int RollNo);
	String deleteStudent(int RollNo);

}
