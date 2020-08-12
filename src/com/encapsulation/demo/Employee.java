package com.encapsulation.demo;

public class Employee {

	private String empName;
	private int salary;
	
	/* //constructor can be used for initialization
	 * Employee(){ 
	 * this.empName = empName; 
	 * this.salary = salary; }
	 */
	
	void setEmpName(String empName) {
		this.empName = empName;
	}

	String getName() {
		return empName;
	}

	void setSalary(int salary) {

		this.salary = salary + 100;

	}
	int getSal() {
		return salary;
	}

}
