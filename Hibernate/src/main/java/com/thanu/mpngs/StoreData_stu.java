package com.thanu.mpngs;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

public class StoreData_stu {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		
		Skills sk1=new Skills();
		sk1.setSk_name("java");
		sk1.setSk_rating(4);
		
		Skills sk2=new Skills();
		sk1.setSk_name("CPP");
		sk1.setSk_rating(4);
		
		
		List<Skills> sklist=new ArrayList<>();
		sklist.add(sk1);
		sklist.add(sk2);
		
		
		
		Student std=new Student();
		
		std.setStd_name("thanu");
		std.setStd_college("Sastra");
		std.setSkills(sklist);
		
		session.persist(std);

		t.commit();
		session.close();//detached
		System.out.println("Done.");
		
	}
}
		