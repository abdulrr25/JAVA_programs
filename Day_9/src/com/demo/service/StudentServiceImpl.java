package com.demo.service;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentServiceImpl implements StudentService{
	private StudentDao sdao;
	
	
	
	public StudentServiceImpl() {
		super();
		this.sdao = new StudentDaoImpl();
	}



	@Override
	public boolean addNewStudent() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Roll Number");
		int rolno = sc.nextInt();
		System.out.println("Enter Your Name");
String nm = sc.next();
System.out.println("Enter Your Percentage");
		double per = sc.nextDouble();
		System.out.println("Enter Your Date of admission in the format of (DD/MM/YYYY)");
		String dt = sc.next();
		LocalDate adt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Student s = new Student(rolno,nm,per,adt);
			
		return sdao.AddNewStudent(s);
	}



	@Override
	public Set<Student> findAll() {
		// TODO Auto-generated method stub
		return sdao.DisplayAll();
	}



	@Override
	public Student findStudentByID(int srollno) {
		// TODO Auto-generated method stub
		return sdao.findStudentById(srollno);
	}



	@Override
	public Set<Student> findStudentByName(String sname) {
		// TODO Auto-generated method stub
		return sdao.findStudentbyName(sname);
	}



	


	@Override
	public boolean ModifyPercentage(int srollno, double sper) {
		// TODO Auto-generated method stub
		return sdao.ModifyPercentage(srollno,sper);
	}



	@Override
	public boolean RemoveRecordById(int rollno) {
		// TODO Auto-generated method stub
		return sdao.RemoveRecordById(rollno);
	}



	@Override
	public boolean RemoveByPercentage(double percentage) {
		// TODO Auto-generated method stub
		return sdao.RemoveByPercentage(percentage);
	}



	@Override
	public Set<Student> sortbypercentag() {
		// TODO Auto-generated method stub
		return sdao.sortbypercentage();
	}



	@Override
	public List<Student> sortByName() {
		// TODO Auto-generated method stub
		return sdao.sortByName();
	}



	@Override
	public List<Student> sortByRollNo() {
		// TODO Auto-generated method stub
		return sdao.sortByRollNo();
	}



	@Override
	public Set<Student> findStudentByPercentage(double percentage) {
		// TODO Auto-generated method stub
		return sdao.sortByPercentage(percentage);
	}



	




	
	
}
