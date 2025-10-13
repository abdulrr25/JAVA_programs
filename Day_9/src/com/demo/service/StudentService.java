package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentService {

	boolean addNewStudent();

	Set<Student> findAll();




	Student findStudentByID(int srollno);

	Set<Student> findStudentByName(String sname);

	

	boolean ModifyPercentage(int srollno, double sper);

	boolean RemoveRecordById(int rollno);

	boolean RemoveByPercentage(double percentage);

	Set<Student> sortbypercentag();

	List<Student> sortByName();

	List<Student> sortByRollNo();

	Set<Student> findStudentByPercentage(double percentage);

}
