package com.hcl.studentsphn.controller;

import java.sql.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.studentsphn.dao.StudentDAOImpl;
import com.hcl.studentsphn.model.Student;
import com.hcl.studentsphn.service.StudentManagerImpl;


@Controller
public class StudentController{

	@RequestMapping("/addStudent")
	public ModelAndView addStudent(HttpServletRequest req, HttpServletResponse res){
		Student student = new Student();
		student.setRollNo(Integer.parseInt(req.getParameter("rollno")));
		student.setStudentName(req.getParameter("sname"));
		student.setAge(Integer.parseInt(req.getParameter("age")));
		student.setGender(req.getParameter("gender"));
		student.setCountry(req.getParameter("country"));
		student.setDateOfJoin(Date.valueOf(req.getParameter("dateOfJoin")));
		student.setFinalScore(Float.parseFloat(req.getParameter("fScore")));
		ModelAndView model = new ModelAndView("Message","message",new StudentManagerImpl().addStudent(student));
		return model;
	}
	
}
