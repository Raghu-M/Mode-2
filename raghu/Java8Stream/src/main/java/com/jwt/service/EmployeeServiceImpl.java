package com.jwt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.dao.EmployeeDAO;
import com.jwt.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employDAO;

	@Override
	public List<Employee> showEmployee() {
		return employDAO.showEmp();
	}

	@Override
	public List<Employee> searchEmployee(String search, String band, String sal) {
		if(band != "" && sal != "")
		return employDAO.searchEmployee(search,band.charAt(0),Integer.parseInt(sal));
		else if(band != "")
			return employDAO.searchEmployee(search,band.charAt(0),' ');
		else if (sal != "")
			return employDAO.searchEmployee(search,' ',Integer.parseInt(sal));
		else return employDAO.searchEmployee(search,' ',' ');
			
	}

}
