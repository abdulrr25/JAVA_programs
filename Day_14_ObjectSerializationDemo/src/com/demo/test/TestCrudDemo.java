package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.*;

public class TestCrudDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		eservice.readFile("empdata1.txt");
		int ch=0;
		do {
			System.out.println("1.Add new Employee\n 2.Delete by id\n");
			System.out.println("3.Modify by id\n 4.Display All\n 5.Display by id 6.exit\n choice: ");
			ch=sc.nextInt();
			switch(ch) {
			case 1->{
				boolean status= eservice.addEmployee();
				if(status) {
					System.out.println("Data Added Successfully");
				}
				else {
					System.out.println("Not found");
				}
				
			}
			
			case 2->{
				System.out.println("Enter id: ");
				int empid=sc.nextInt();
				boolean status=eservice.RemovebyId(empid);
				if(status) {
					System.out.println("Delete Salary Successfully ");
				}
				else {
					System.out.println("Not found");
				}
			}
			case 3->{
				System.out.println("Enter id: ");
				int eid=sc.nextInt();
				System.out.println("Enter Salary: ");
				Double sal=sc.nextDouble();
				boolean status=eservice.ModifybyId(eid,sal);
				if(status) {
					System.out.println("Salary Updated Successfully");
				}
				else {
					System.out.println("Not found");
				}
			}
			case 4->{
				List<Employee>list=eservice.getAll();
				list.forEach(System.out::println);
			}
			case 5->{
				System.out.println("Enter id: ");
				int eid=sc.nextInt();
			}
			}
		}while(ch!=6);
			
		

	}

}
