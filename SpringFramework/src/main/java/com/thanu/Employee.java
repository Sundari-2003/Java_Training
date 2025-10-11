package com.thanu;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	private String cmp;
	
	@Autowired
	private Address adrAddress;
	
	public Employee()
	{
		
	}
	
	
public Employee(int id,String name,String cmp,Address adrAddress)
	{
		this.id=id;
		this.name=name;
		this.cmp=cmp;
		this.adrAddress=adrAddress;
		
	}
	
	public Address getAdrAddress() {
		return adrAddress;
	}

	public void setAdrAddress(Address adrAddress) {
		this.adrAddress = adrAddress;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCmp() {
		return cmp;
	}
	
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cmp=" + cmp + ", adrAddress=" + adrAddress + "]";
	}




	
	
	
	

}
