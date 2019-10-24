package hcl.AnnotationEmploy;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SearchEmpMain {
	public static void main(String[] args) {

		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		System.out.println("enter EmpNo");
		int empno = new Scanner(System.in).nextInt();
		Query q=s.createQuery("from Employ WHERE Empno="+empno);
		List<Employ> list=q.list();
		Employ e = list.get(0);
		if(e != null){
				System.out.println("Employ no........."+e.getEmpno());
				System.out.println("Name of Employ...."+e.getName());
				System.out.println("Department........"+e.getDept());
				System.out.println("Designation......."+e.getDesig());
				System.out.println("Basic............."+e.getBasic());
				System.out.println();
		} else{
			System.out.println("Employ Not Found");
		}
	}
}
