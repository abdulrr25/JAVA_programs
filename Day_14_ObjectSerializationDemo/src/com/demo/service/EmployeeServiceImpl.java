package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.*;
import com.demo.beans.*;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	

	@Override
	public void readFile(String fname) {
		edao.readData(fname);
		
	}

	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int empid=sc.nextInt();
		System.out.println("Enter name: ");
		String nm=sc.next();
		System.out.println("Enter Dsignation");
		String deg=sc.next();
		System.out.println("Enter Salary: ");
		Double sal=sc.nextDouble();
		Employee e=new Employee(empid,nm,deg,sal);
		return edao.save(e);
	}

	@Override
	public boolean RemovebyId(int empid) {
		// TODO Auto-generated method stub
		return edao.DeletebyId(empid);
	}

	@Override
	public boolean ModifybyId(int eid, Double sal) {
		// TODO Auto-generated method stub
		return edao.UpdateById(eid,sal);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return edao.FindAll();
	}

	

}
