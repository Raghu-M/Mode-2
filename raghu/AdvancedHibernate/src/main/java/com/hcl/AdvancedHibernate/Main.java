package com.hcl.AdvancedHibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class Main {
	
	
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		
		q.setFirstResult(2);
		q.setMaxResults(3);
		List<Employ> list = q.list();
		for(Employ i : list){
			System.out.println(i.toString());
		}
		
		q=s.createQuery("from Employ");
		Criteria c=s.createCriteria(Employ.class);
		c.setProjection(Projections.property("name"));
		for(Object i :c.list()){
			System.out.println(i.toString());
			
			
		
		}
		q = s.getNamedQuery("Nanu");
		q.setInteger("id", 4);
		Employ e = (Employ) q.uniqueResult();
		System.out.println("\n\n\n\n\n"+e.toString());
		sf.close();	
		
	}

}
