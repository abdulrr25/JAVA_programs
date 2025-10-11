package com.demo.Service;
import com.demo.beans.*;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import com.demo.beans.SalariedEmployee;
import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
public class EmployeeService {
	static Employee[] emparr;
	   static int count;
	   static {
		   emparr=new Employee[100];
		   emparr[0]=new SalariedEmployee("Rajan",new Date(2000,04,23),"HR","Designer",88888);
	   	   emparr[1]=new SalariedEmployee("Revati",new Date(2000,04,23),"UX","Designer",99999);
		   emparr[2]=new ContractEmployee("Ameya",new Date(2000,04,23),"HR","Designer",80,3000);
		   emparr[3]=new ContractEmployee("Ashu",new Date(2000,04,23),"UX","Designer",80,4000);		   
		   count=4;
	   }
	public static boolean addNewEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		if(count<emparr.length) {
		System.out.println("Enter Your NAME");
		String nm= sc.next();
		System.out.println("Enter Your Birth Date");
		String bdate=sc.next();
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    Date dt = null;
	    
	    try {
	    	dt = sdf.parse(bdate);
	    }
	    catch(ParseException e) {
	    	e.printStackTrace();
	    }
	    
	    System.out.println("Enter Your Department");
	    String dept = sc.next();
	    System.out.println("Enter you Designation");
	    String desg = sc.next();
	    if(ch==1) {
	    	System.out.println(":Enter Your salary");
	    	double sal = sc.nextDouble();
	    	emparr[count]=new SalariedEmployee(nm,dt,dept,desg,sal);
	    	count++;
	    }
	    else if(ch==2) {
	    	System.out.println("Enter Number of Hours");
	    	float hrs = sc.nextFloat();
	    	System.out.println("Enter Your Charges ");
	    	double chg = sc.nextDouble();
	    	emparr[count]=new ContractEmployee(nm,dt,dept,desg,hrs,chg);
	    	count++;
	    	
	    }
	    return true;
		}
		return false;
	    
	}
	public static void displayAll() {
		// TODO Auto-generated method stub
		
		for(Employee e:emparr) {
			if(e!=null) {
				
			System.out.println(e);
			}
		}
		
	}
	public static Employee SearchbyId(String id) {
		// TODO Auto-generated method stub
		for(Employee e:emparr) {
			if(e.getPid().equals(id)) {
				
			return(e);
			}
			else
			{
				return null;
			}
		}
		return null;
	}
	public static boolean ModifyId(String id, Double charges) {
		// TODO Auto-generated method stub
		Employee e = SearchbyId(id);
		if(e!=null && e instanceof SalariedEmployee) {
			((SalariedEmployee)e).setSal(charges);
			return true;
		}
		else if(e!=null && e instanceof ContractEmployee) {
			((ContractEmployee)e).setCharges(charges);
			return true;
		}
		return false;
	}
	public static void DisplayonlySalariedEmp() {
		// TODO Auto-generated method stub
		for(Employee e : emparr) {
			if(e instanceof SalariedEmployee) {
				System.out.println(e);
			}
		}
		
	}
	public static void DisplayonlyContractEmp() {
		// TODO Auto-generated method stub
		for(Employee e : emparr) {
			if(e instanceof ContractEmployee) {
				System.out.println(e);
			}
		}
		
	}
	public static boolean SearchByName(String nm) {
		// TODO Auto-generated method stub
		for(Employee e :emparr) {
			if(e.getPname().equals(e)) {
				return true;
			}
		}
		return false;
	}
	public static void CalculateNetSalary(String pid) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		for(Employee e:emparr) {
			if(e.getPid().equals(pid) && e instanceof SalariedEmployee) {
				
				System.out.println("Enter your Basic salary");
				double s = sc.nextDouble();
				((SalariedEmployee)e).setSal(s);
				
				double d= e.calculateSal();
				System.out.println(d);
			}
			else if (e.getPid().equals(pid) && e instanceof ContractEmployee) {
				System.out.println("Enter your charges and hours");
				double ch = sc.nextDouble();
				float hr = sc.nextFloat();
				
				((ContractEmployee)e).setCharges(ch);
				((ContractEmployee)e).setHrs(hr);
				double d = e.calculateSal();
			
				System.out.println(d);
			}
			else {
				System.out.println("Employee Id Did not match");
			}
		}
		double sal = 0;
		
		
	}
	
}
