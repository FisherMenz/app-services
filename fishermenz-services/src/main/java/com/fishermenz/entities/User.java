package com.fishermenz.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	
	public User() {
	}
	
	public User(String firstName, String lastName, String emailAddress, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.password = password;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String toString() {
		return String.format("User[id=%s, firstName='%s', lastName='%s', emailAddress='%s']", id, firstName, lastName, emailAddress);
	}

}
