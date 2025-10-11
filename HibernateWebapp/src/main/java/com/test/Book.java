package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name="findBookByName",query="from Book b where b.b_name=:name")
})
 
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String b_name;
	
	private String b_author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_author() {
		return b_author;
	}
	public void setB_author(String b_author) {
		this.b_author = b_author;
	}
	
	

}
