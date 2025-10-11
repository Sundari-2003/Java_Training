package com.thanu.mpngs;

import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.TRANSACTIONAL)

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "",nullable=false,unique=true)
	private String Std_name;
	private String Std_college;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="s_id")
	@OrderColumn(name="type")
	private List<Skills> skills;

	public String getStd_name() {
		return Std_name;
	}

	public void setStd_name(String std_name) {
		Std_name = std_name;
	}

	public String getStd_college() {
		return Std_college;
	}

	public void setStd_college(String std_college) {
		Std_college = std_college;
	}

	public List<Skills> getSkills() {
		return skills;
	}
 
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
 
	
	
	
	

}
