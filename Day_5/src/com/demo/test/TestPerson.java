package com.demo.test;
import java.util.Date;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;

public class TestPerson {
    public static void main(String[] args) {
    	
    	SalariedEmployee s1=new SalariedEmployee("Rajan",new Date(2000,04,23),"HR","Designer",88888);
    	SalariedEmployee s2=new SalariedEmployee("Revati",new Date(2000,04,23),"UX","Designer",99999);
    	System.out.println("net sal= "+s1.calculateSal());
    	ContractEmployee c1=new ContractEmployee("Mugdha",new Date(2000,04,23),"HR","Designer",80,3000);
    	ContractEmployee c2=new ContractEmployee("Tanaya",new Date(2000,04,23),"UX","Designer",80,4000);
    	System.out.println("net charges= "+c1.calculateSal());
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(c1);
    	System.out.println(c2);
    
    	//Employee e1=new Employee("s","Sujata",new Date(),"Hr","Manager");
		/*Person p1=new Person("s","Rajan",new Date(2000,04,23));
		System.out.println(p1);
		Person p2=new Person("c","Bhavika",new Date(2000,04,23));
		System.out.println(p2);
		Employee e1=new Employee("s","Sujata",new Date(),"Hr","Manager");
		System.out.println(e1);*/
		
	}
}
