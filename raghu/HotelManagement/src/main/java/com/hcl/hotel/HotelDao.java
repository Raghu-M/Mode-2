package com.hcl.hotel;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class HotelDao {
	
	public String addRoom(Room ob){
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		ob.setRoomID(new HotelDao().generateRoomId());
		Transaction t = s.beginTransaction();
		s.save(ob);
		t.commit();
		return "Room Inseted";
		
	}
	
	public String generateRoomId(){
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("SELECT MAX(RoomID) from Room");
		List<String> list=q.list();
		String fid = list.get(0);
		if(fid == null)return "R001";
		fid = "R"+String.format("%03d",(Integer.parseInt(fid.substring(1))+1));
		return fid;
	}
	
	public String bookRoom(Booking ob){
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		ob.setBookId(new HotelDao().generateBookId());
		Query q=s.createQuery("FROM Room WHERE RoomID='"+ob.getRoomID()+"'");
		List<Room> list = q.list();
		Room r = list.get(0);
		r.setStatus("BOOKED");
		Transaction t = s.beginTransaction();
		s.save(r);
		s.save(ob);
		t.commit();
		
		return "Room Booked";
		
	}
	
	public String generateBookId(){
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("SELECT MAX(BookId) from Booking");
		List<String> list=q.list();
		String fid = list.get(0);
		if(fid == null)return "B001";
		fid = "B"+String.format("%03d",(Integer.parseInt(fid.substring(1))+1));
		return fid;
	}
	
	public List<String> getBookId(){
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("SELECT RoomID from Room WHERE Status='Available'");
		List<String> list=q.list();
		return list;
	}
}
