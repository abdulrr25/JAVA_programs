package com.demo.test;

import com.demo.beans.*;
import java.util.List;
import java.util.ArrayList;


public class TestStudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"Aakanksha",86,65,98));
		slist.add(new Student(22,"AbdulRahman",66,25,88));
		slist.add(new Student(12,"Ayan",36,95,88));
		slist.add(new Student(5,"KalyaniDON",66,25,88));
		for(int i=0;i<slist.size();i++) {
			System.out.println(slist.get(i));
		}
		System.out.println("----------------------");
		for(Student s:slist) {  
			System.out.println(s);  
		}
		System.out.println("----------------------");
	}

}
