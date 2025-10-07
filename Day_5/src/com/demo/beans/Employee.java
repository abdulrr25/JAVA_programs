package com.demo.beans;

import java.util.Date;

public abstract class Employee extends Person{
	private String dept;
	private String desg;
	public Employee() {
		super();
		System.out.println("in employee Default constructor");

	}
	public Employee(String empType, String pname, Date bdate,String dept, String desg) {
		super(empType,pname,bdate);
		System.out.println("in employee parameterised constructor");
		//super will call parameterized constructor of Person
		this.dept = dept;
		this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	abstract public double calculateSal(); 

	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
}
