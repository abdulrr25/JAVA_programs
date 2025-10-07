package com.demo.test;
import java.util.Scanner;

import com.demo.Service.EmployeeService;
import com.demo.beans.Employee;

public class TestEmployMngmtSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Add new employee\n 2. Display all ");
			System.out.println("3. Display by id\n 4. Change sal or cgarges ");
			System.out.println("5. Display salaried employee\n 6. Display contract Employee \n ");
			System.out.println("1. Search by name\n 2. Calculate net salary 9. exit\n choice");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1.Salaried\n 2.Contrat \n 3.Vendor \n choice");
				int ch=sc.nextInt();
				boolean status = EmployeeService.addNewEmployee(ch);
				if(status) {
					System.out.println("Added Successfully");
				}
				else {
					System.out.println("Error:not added");
				}
				
				break;
			case 2:
				EmployeeService.displayAll();
				break;
			case 3:
				System.out.println("Enter ID:");
				String id=sc.next();
				Employee e = EmployeeService.SearchbyId(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("Enter ID:");
				id = sc.next();
				System.out.println("Enter new salary/Charges");
				Double charges = sc.nextDouble();
				status = EmployeeService.ModifyId(id,charges);
				if(status) {
					System.out.println("Updated Successfully");
				}
				else {
					System.out.println("not found");
				}
				break;
			case 5:
				EmployeeService.DisplayonlySalariedEmp();
				break;
			case 6:
				EmployeeService.DisplayonlyContractEmp();
				break;
			case 7:
				System.out.println("Enter Your Name");
				String nm = sc.next();
				boolean b = EmployeeService.SearchByName(nm);
				if(b) {
					System.out.println("Data Found");
				}
				else {
					System.out.println("Name not found");
				}
				
				break;
			case 8:
				
				System.out.println("Enter the id of the person to get his net salary");
				String pid=sc.next();
				EmployeeService.CalculateNetSalary(pid);
				break;
			case 9:
				System.out.println("Thankyou for visiting....");
				sc.close();
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}while(choice!=9);

	}

}
