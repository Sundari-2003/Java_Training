package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaQuery;

public class BookDao {
	public static void registerBook(Book book)
	{
		int i=0;
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		session.persist(book);
		
		session.persist(book);
//		t.commit();
		
		TypedQuery<Book>  q=session.getNamedQuery("findBookByName");
		q.setParameter("name", book.getB_name());
		t.commit();
		
		List<Book> bk=q.getResultList();
		System.out.println(bk);
		
		HibernateCriteriaBuilder cq = session.getCriteriaBuilder();
//		cq.listParameter(Book.class , null);
		session.close();
		
		
		
	}

}
