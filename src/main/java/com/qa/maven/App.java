package com.qa.maven;

import com.qa.validate.EmailValidator;

public class App {

	public static void main(String[] args) {
		String email = "jordan.harrison@qa.com";

		if (EmailValidator.validateEmail(email))
			System.out.println("Valid email: " + email);
		else
			System.out.println("Invalid email: " + email);
	}

}
