package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	static List<Student> slist;
    static {
    	slist=new ArrayList<>();
		slist.add(new Student(1,"Aakanksha",86,65,98));
		slist.add(new Student(22,"AbdulRahman",66,25,88));
		slist.add(new Student(12,"Ayan",36,95,88));
		slist.add(new Student(5,"KalyaniDON",66,25,88));
    }
	@Override
	public boolean save(Student s) {
		// TODO Auto-generated method stub
		slist.add(s);
		return true;
	}
	@Override
	public List<Student> DisplayAll() {
		
		return slist;
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public Student searchById(int id) {
		// TODO Auto-generated method stub
		int pos = slist.indexOf(new Student(id));
		if(pos!=-1) {
			return slist.get(pos);
		}
		return null;
	}
	

	@Override
	public List<Student> searchByName(String nm) {
		Stream<Student> temp = slist.stream().filter(snm->snm.getNm().equals(nm));
		return (List<Student>) temp;
	}}
