package edu.mum.server.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Employee {

	@NotBlank
 	private String firstName;
	@NotBlank
	@Size(min=3, max=10, message = "{Size.lastName.validation}")
 	private String lastName;
	@NotBlank
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
