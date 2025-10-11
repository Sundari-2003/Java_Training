package com.thanu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Student obj=ctx.getBean("std",Student.class);
		System.out.println(obj);
	}
	
}
