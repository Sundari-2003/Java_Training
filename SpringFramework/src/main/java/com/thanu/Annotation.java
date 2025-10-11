package com.thanu;

import org.springframework.context.annotation.*;

@Configuration
public class Annotation {
	
	@Bean
	public Address getAdrConstDi()
	{
		return new Address("tpt","AP",345345);
	}
	
	@Bean
	public Employee getEmpSetterDi()
	{
		return new Employee();
	}
	
	@Bean
	public Employee getEmpConsDi()
	{
		return new Employee(301,"sky","pwc",getAdrConstDi());
	}
}
