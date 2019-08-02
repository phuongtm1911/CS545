package edu.mum.server.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class Employee {

	@NotEmpty
 	private String firstName;
	@NotEmpty
	@Size(min=3, max=10)
 	private String lastName;
	@NotEmpty
 	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
