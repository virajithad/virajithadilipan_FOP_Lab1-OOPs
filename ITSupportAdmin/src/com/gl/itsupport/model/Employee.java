package com.gl.itsupport.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	
	public Employee(String name1, String name2) {
		this.firstName = name1;
		this.lastName = name2;
	}
	
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
	
}
