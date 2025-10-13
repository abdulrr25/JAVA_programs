package com.demo.test;

import java.util.Scanner;

import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class TestOrdemgntSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		OrderService oservice=new OrderServiceImpl();
		int choice =0;
		do {
			System.out.println("1. add new customer\n2. display all\n3. display by customer");
			System.out.println("4. delete customer\n5. add a new item in existing order");
			System.out.println("6. delete item from existing order\n7.exit\n choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status = oservice.addNewCustomer();
				if(status) {
					System.out.println("Added Successfully");
				}
				else {
					System.out.println("Not Added");
				}
			}
			}
		}while(choice!=7);
		

	}

}
