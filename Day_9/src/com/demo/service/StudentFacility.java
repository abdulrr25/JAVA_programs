package com.demo.service;

import java.util.List;

import com.demo.beans.Student;
public interface StudentFacility {
	boolean addNewStudent();

	List<Student> DisplayAll();

	Student searchById(int id);

	List<Student> searchByName(String nm);

}
