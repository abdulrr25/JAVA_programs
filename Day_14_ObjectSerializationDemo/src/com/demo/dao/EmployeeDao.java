package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readData(String fname);

	boolean save(Employee e);

	boolean DeletebyId(int empid);

	boolean UpdateById(int eid, Double sal);

	List<Employee> FindAll();

}
