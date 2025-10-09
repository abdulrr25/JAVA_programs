package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.dao.*;
import com.demo.beans.*;
import com.demo.service.*;
import com.demo.service.StudentFacilityService;

public class TestStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentFacility facility = new StudentFacilityService();
		int ch =0;
		do {
			System.out.println("1. ADD NEW STUDENT \n2. DISPLAY ALL STUDENTS \n3. SEARCH BY ID");
			System.out.println("4. SEARCH BY NAME \n5. UPDATE MARKS \n6. SORT BY AVERAGE MARKS");
			System.out.println("7. SORT BY NAME \n8. SORT BY ID \n9. Exit \n ENTER YOUR CHOICE");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1->{
				boolean status = facility.addNewStudent();
				if(status) {
					System.out.println("Added Successfully");
				}
				else {
					System.out.println("Unable to add");
				}
			}
			case 2->{
				List<Student> s =facility.DisplayAll();
				s.forEach(System.out::println);
			}
			case 3->{
				System.out.println("Enter Id To Search");
				int id = sc.nextInt();
				
				Student s =facility.searchById(id);
				if(s!=null) {
					System.out.println(s);
				}
				else {
					System.out.println("Student not found");
				}
			}
			case 4->{
				System.out.println("Enter Your Name to Search");
				String nm = sc.next();
				
				List<Student> s = facility.searchByName(nm);
				if(s!=null) {
					s.forEach(System.out::println);
				}
				else {
					System.out.println("Data Not Found");
				}
			}
			case 9->{
				sc.close();
				System.out.println("Thankyou for Visiting");
			}
			default->{
				System.out.println("Invalid Input");
			}
			}
			
			
		}
		while(ch!=9);

	}

}
