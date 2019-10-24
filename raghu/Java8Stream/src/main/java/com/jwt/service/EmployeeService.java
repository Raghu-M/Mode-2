package com.jwt.service;

import java.util.List;

import com.jwt.model.Employee;

public interface EmployeeService {
	
	public List<Employee> showEmployee();
	public List<Employee> searchEmployee(String search,String band, String sal);
}
