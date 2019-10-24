package com.hcl.studentsphn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import com.hcl.studentsphn.model.Student;

public class StudentDAOImpl implements StudentDAO{

	public String addStudent(Student student) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(student);
		t.commit();
		return "Student Added";

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
