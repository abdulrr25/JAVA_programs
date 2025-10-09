package com.demo.service;
import java.util.*;
import com.demo.beans.*;

public interface EmployeeService {
	
	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	boolean deleteById(int eid);

	List<Employee> findByName(String nm);
                                                      

}
