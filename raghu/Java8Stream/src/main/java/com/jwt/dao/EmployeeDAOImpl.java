package com.jwt.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jwt.model.Employee;

@Repository
public class EmployeeDAOImpl implements  EmployeeDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> showEmp() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> searchEmployee(String search,char band, int sal) {
		List<Employee> list = sessionFactory.getCurrentSession().createQuery("from Employee").list();
		list = list.stream().filter(a -> a.getEmpName().toLowerCase().startsWith(search.toLowerCase())).collect(Collectors.toList());
		if(band != ' ')
			list = list.stream().filter(a -> a.getBand() == band).collect(Collectors.toList());
		if(sal != ' ')
			list = list.stream().filter(a -> a.getSalary() >= sal).collect(Collectors.toList());
		return list;
	}

}
