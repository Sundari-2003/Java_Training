package com.test;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("#{'Sridhar'.toUpperCase()}")
	private String name;
	
	@Value("#{50 + 20}")
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
