package com.thanu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfig {
		public static void main(String[] args) {
			ApplicationContext ctx1=new AnnotationConfigApplicationContext(Annotation.class);
			Employee obj3=ctx1.getBean("getEmpSetterDi",Employee.class);
			System.out.println(obj3);
			
			Employee obj4=ctx1.getBean("getEmpConsDi",Employee.class);
			System.out.println(obj4);
			}
	
	
	
}
