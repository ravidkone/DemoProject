package com.encapsulation.demo;

public class Company {
	
	public static void main(String[] args) {
		
	  //Employee e=new Employee("vinita",23000);

		Employee e=new Employee();
		
		e.setEmpName("vinita khed");
		System.out.println("Emp name is: "+e.getName());
		
		e.setSalary(20000);
		System.out.println("Salary is: "+e.getSal());
	}

}

// Encapsulation is one of the OOPS concept
// It is used to hide the data
// The code and data is binded together inside a class
//