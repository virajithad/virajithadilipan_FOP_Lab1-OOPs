package com.gl.itsupport.driver;

import java.util.Scanner;
import com.gl.itsupport.model.Employee;
import com.gl.itsupport.model.Service;

public class Driver {
	

	public static void main(String[] args) {
		int option;
		String Email ;
		String password;
		String department;
		
		Employee employee = new Employee("Harshit", "Choudary");
		Service service = new Service();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HumanResource");
		System.out.println("4. Legal");
		
		option = scanner.nextInt();
		
		switch(option) {
			case 1:
				department = "tech";
				break;
			case 2:
				department = "admin";
				break;
			case 3:
				department = "hr";
				break;
			case 4:
				department = "legal";
				break;
		    default:
				return;
		}
		scanner.close();
		
		Email = service.generateEmailId(employee.getFirstName(), 
				employee.getLastName(), 
				department);
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows" );
		System.out.println("Email Id --> " + Email );
		
		password = service.generatePassword();
		
		System.out.println("Password --> " + password );

	}

}
