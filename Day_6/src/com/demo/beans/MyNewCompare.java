package com.demo.beans;

import com.demo.Interface.MyComparable;

public class MyNewCompare implements MyComparable{
	

	@Override
	public int compare(int a, int b) {
		System.out.println("In compare method");
		// TODO Auto-generated method stub
		return 10;
	}

}
