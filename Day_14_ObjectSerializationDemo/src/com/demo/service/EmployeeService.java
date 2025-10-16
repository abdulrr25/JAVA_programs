package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readFile(String fname);

	boolean addEmployee();

	boolean RemovebyId(int empid);

	boolean ModifybyId(int eid, Double sal);

	List<Employee> getAll();


}
