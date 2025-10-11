package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {

	@Value("111")
	private Integer id;

	@Value("Sundari")
	private String firstname;

	@Value("Sridhar")
	private String lastname;

	@Value("Simple EL Example")
	private String message;

	@Value("${user.fullName: Sundari Sridhar}")
	private String fullName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", message=" + message
				+ ", fullName=" + fullName + "]";
	}

}
