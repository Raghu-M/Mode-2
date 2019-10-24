package hcl.AnnotationEmploy;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class InsertEmpMain {
	public static void main(String[] args) {

		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Employ ob = new Employ();
		System.out.println("enter name, dept, desig, salary");
		Scanner sc = new Scanner(System.in);
		Query q = s.createQuery("SELECT max(empno) from Employ");
		for(Iterator it=q.iterate();it.hasNext();){
			ob.setEmpno((Integer)it.next()+1);
		}
		ob.setName(sc.next());
		ob.setDept(sc.next());
		ob.setDesig(sc.next());
		ob.setBasic(sc.nextInt());
		Transaction t = s.beginTransaction();
		s.save(ob);
		t.commit();
	}
}
