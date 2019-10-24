package com.jwt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Employee;
import com.jwt.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(value="/")
	public ModelAndView showEmploy(ModelAndView model){
		List<Employee> list = empService.showEmployee();
		model.addObject("empList", list);
		model.setViewName("ShowEmp");
		return model;
	}
	
	@RequestMapping(value="/searchEmp")
	public ModelAndView searchEmploy(ModelAndView model, HttpServletRequest req){
		List<Employee> list = empService.searchEmployee(req.getParameter("search"),req.getParameter("band"),req.getParameter("salary"));
		model.addObject("empList", list);
		model.setViewName("ShowEmp");
		return model;
	}

}
