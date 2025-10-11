package com.thanu.mpngs;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Skills")
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSk_name() {
		return sk_name;
	}
	public void setSk_name(String sk_name) {
		this.sk_name = sk_name;
	}
	public int getSk_rating() {
		return sk_rating;
	}
	public void setSk_rating(int sk_rating) {
		this.sk_rating = sk_rating;
	}
	private String sk_name;
	private int sk_rating;
}
 