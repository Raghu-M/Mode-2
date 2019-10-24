package com.hcl.employ;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;



public class MainProg {

	public List<Employ> show(){

		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		List list=q.list();
		return list;
	}
	
	public Employ searchEmp(int empno){

		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ WHERE empno = "+empno);
		List<Employ> list=q.list();
		Employ emp = null;
		if(list.size() != 0){
			emp=list.get(0);
		}
		return emp;
	}
	
	public String InsertEmp(Employ emp){

		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q = s.createQuery("SELECT max(empno) from Employ");
		for(Iterator it=q.iterate();it.hasNext();){
			emp.setEmpno((Integer)it.next()+1);
		}
		Transaction t = s.beginTransaction();
		s.save(emp);
		t.commit();
		return "Employ Inseted";
	}
	
	
	public String updateEmp(Employ emp){
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(emp);
		t.commit();
		return "Employ Updated";
	}
	
	public void deleteEmp(Employ emp){
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(emp);
		t.commit();
	}
}