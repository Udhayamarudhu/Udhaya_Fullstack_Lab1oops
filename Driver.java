package com.greatlearning.employee.email.main;

import java.util.Scanner;

import com.greatlearning.employee.email.model.Employee;
import com.greatlearning.employee.email.service.CredentialServiceImpl;
import com.greatlearning.employee.email.service.CredentialService;

public class Driver {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		CredentialService service =new CredentialServiceImpl();
		Employee emp=new Employee("Ram","Kumar");
		System.out.println("Please Enter the department from the following:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		int choice=in.nextInt();
		String department=null;
		switch(choice) {
		case 1:department="tech";
		       break;
		case 2:department="adm";
	       break;
		case 3:department="hr";
	       break;
		case 4:department="lgl";
	       break;
	       default:
	    	   System.out.println("Please select the valid details");
	    	   
		}
		if(department!=null) {
			emp.setDepartment(department);
			String emailAddress=service.generatreEmailAddress(emp);
			emp.setEmailAddress(emailAddress);
			String password=service.generatePassword();
			emp.setPassword(password);
			service.showCredentials(emp);
			
		}

	}

}
