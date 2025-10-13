package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentDao {

	boolean AddNewStudent(Student s);

	Set<Student> DisplayAll();

	Student findStudentById(int srollno);

	Set<Student> findStudentbyName(String sname);

	boolean ModifyPercentage(int srollno, double sper);

	boolean RemoveRecordById(int rollno);

	boolean RemoveByPercentage(double percentage);

	Set<Student> sortbypercentage();

	List<Student> sortByName();

	List<Student> sortByRollNo();

	Set<Student> sortByPercentage(double percentage);

}
