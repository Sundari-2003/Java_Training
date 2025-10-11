package com.thanu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args)
	{
		//BeanFactory is super interface for ApplicationContext
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		
//		ctx.getBean("emp1",Employee.class);
	
		Employee obj=(Employee)ctx.getBean("emp");
		System.out.println(obj);
		
		Employee obj1=(Employee)ctx.getBean("emp1");
		System.out.println(obj1);
		
	

	}

}
