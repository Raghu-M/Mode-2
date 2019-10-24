package com.jwt.dao;

import java.util.List;

import com.jwt.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> showEmp();
	public List<Employee> searchEmployee(String search, char band,int sal);

}
