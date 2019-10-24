package com.hcl.studentsphn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentController{
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext();
		Vehicle obj = (Vehicle) ctx.getBean("vehicle");
		obj.drive();
	}
}
