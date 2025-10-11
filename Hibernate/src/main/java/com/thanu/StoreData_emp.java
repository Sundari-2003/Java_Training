package com.thanu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.Transaction;

public class StoreData_emp {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		
		Employee emp=new Employee();//transient
		
		emp.setEmp_name("Rohit");
		emp.setEmp_cmp("bcci");
		emp.setEmp_salary(2345);
		
		session.persist(emp);//persistence
		
//	
//		Employee obj=session.get(Employee.class, 1);
//		System.out.println(obj.getId()+" "+obj.getEmp_name()+" "+obj.getEmp_cmp()+" "+obj.getEmp_salary());
//		
//		obj.setEmp_name("Thanushri");
//		obj.setEmp_cmp("IPL");
//		obj.setEmp_salary(34446);
//		
//		session.persist(obj);
		
		Employee obj=session.get(Employee.class, 2);
//		session.remove(obj);
		
		
		Query q=session.createQuery("delete from employee01 where id=52");
		q.executeUpdate();
		
		t.commit();
		session.close();//detached
		System.out.println("Done.");
	}

	

}
