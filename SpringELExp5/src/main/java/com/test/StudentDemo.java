package com.test;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class StudentDemo {
 
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Student obj=ctx.getBean("std",Student.class);
		System.out.println(obj);
		
		ClientDataA cobj = ctx.getBean("clnt" , ClientDataA.class);
		System.out.println(cobj);
	}
}
 
 