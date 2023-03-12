package com.greatlearning.employee.email.service;

import java.util.Random;

import com.greatlearning.employee.email.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	final String COMPANY_DOMAIN=".abc.com";
	   final int PASSWORD_SIZE=8;
		@Override
		public String generatreEmailAddress(Employee employee) {
		String firstName=employee.getFirstName() ;
		String lastName=employee.getLastName();
		
		String department=employee.getDepartment();
		return firstName+lastName+"@"+department+COMPANY_DOMAIN;
		
		}

		@Override
		public String generatePassword() {
			String capitalCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String smallCase=capitalCase.toLowerCase();
			String nums="0123456789";
			String splChars="!@#$%^&*()";
			String password="";
			String passwordChars=capitalCase+smallCase+nums+splChars;
			Random random=new Random();
			for(int i=0;i<PASSWORD_SIZE;i++) {
				password=password+passwordChars.charAt(random.nextInt(passwordChars.length()));
			}
	        return password;
		}

		@Override
		public String showCredentials(Employee employee) {
			System.out.println("Dear "+employee.getFirstName()+" your generated credentials");
			System.out.print("Email   -->  "+employee.getEmailAddress());
			System.out.print("  Password   -->  "+employee.getPassword());
			return null;
		}
		

}
