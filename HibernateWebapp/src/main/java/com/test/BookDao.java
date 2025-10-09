package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookDao {
	public static void registerBook(Book book)
	{
		int i=0;
		
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		session.persist(book);
		
		session.persist(book);
		t.commit();
		session.close();
		
		
		
	}

}
