package com.gl.itsupport.model;

import java.util.Random;

public class Service {
	
	public String generateEmailId (String firstName, String lastName, String department)
	{
		String email = firstName.concat(lastName)+"@"+ department + "." + "greatlearning.com";
		return email ;
	}
	
	public String generatePassword()
	{
		char[] password = new char[8];
		Random random = new Random();
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "123456789";
		String specialChar = "<>!@$&*/?%#€";
		
		String values = capitalLetters + smallLetters+ numbers+ specialChar;
		
		
		for(int i=0; i<8; i++)
		{
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		
		return new String(password);
	}

}
