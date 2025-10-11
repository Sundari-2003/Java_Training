package com.thanu;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee01")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "",nullable=false,unique=true)
	private String emp_name;
	private String emp_cmp;
	private long emp_salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_cmp() {
		return emp_cmp;
	}
	public void setEmp_cmp(String emp_cmp) {
		this.emp_cmp = emp_cmp;
	}
	public long getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(long emp_salary) {
		this.emp_salary = emp_salary;
	}
 
}


