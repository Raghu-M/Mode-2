package com.hcl.Json2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Example1 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:/Users/coalesce/Desktop/Employee.json");    
	    BufferedReader br=new BufferedReader(fr);   
	    StringBuilder s = new StringBuilder();
	    int i;    
	    while((i=br.read())!=-1){  
	    	s.append((char)i);  
	    }  
	    JSONArray arr = (JSONArray)((JSONObject) JSONValue.parse(s.toString())).get("employees");
	    
	    Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
	    for(i=0;i<arr.size();i++){
	    	Employee e = new Employee();
		    JSONObject j = (JSONObject) arr.get(i);
		    e.setName((String)j.get("name"));
		  	e.setSalary(Double.parseDouble(j.get("Salary").toString()));
		  	long l = (Long) j.get("id");
		  	e.setId((int)(l));
		  	Transaction t = session.beginTransaction();
			session.save(e);
			t.commit();
	    }
	    
	    System.out.println("**************Employess Inserted**********");
	}
}
