package com.demo.service;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentFacilityService implements StudentFacility{

	private StudentDao sdao;
	
	public StudentFacilityService() {
		sdao = new StudentDaoImpl();
	}

	public boolean addNewStudent() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = sc.nextInt();
		System.out.println("Enter your Name");
		String nm = sc.next();
		System.out.println("Enter your Marks1");
		int m1 = sc.nextInt();
		System.out.println("Enter your Marks2");
		int m2 = sc.nextInt();
		System.out.println("Enter your Marks3");
		int m3 = sc.nextInt();
		Student s = new Student(id,nm,m1,m2,m3);
		return sdao.save(s);
		
		
	}

	public List<Student> DisplayAll() {
		// TODO Auto-generated method stub
		return sdao.DisplayAll();
		
		
	}

	@Override
	public Student searchById(int id) {
		// TODO Auto-generated method stub
		return sdao.searchById(id);
	}

	@Override
	public List<Student> searchByName(String nm) {
		// TODO Auto-generated method stub
		return sdao.searchByName(nm);
	}
	
	

}
