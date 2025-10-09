package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MyNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("In nameComparator compare method");
		System.out.println("Names: "+o2.getEname()+"-----"+o2.getEname());
		return o1.getEname().compareTo(o2.getEname());
		// TODO Auto-generated method stub
		
	}
	

}
