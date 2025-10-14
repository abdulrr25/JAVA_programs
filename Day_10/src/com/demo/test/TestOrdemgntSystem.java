package com.demo.test;

import com.demo.beans.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Item;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;
import com.demo.test.*;

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
			case 2->{
				Map<Customer,List<Item>> omap=oservice.displayAll();
				Set<Customer>keys=omap.keySet();
				keys.forEach(c->System.out.println(c+"--->"+omap.get(c)));
				
			}
			case 3->{
				System.out.println("Enter Customer Name : ");
				String cnm = sc.next();
				Set<Customer> oset=oservice.displaybyCustomer(cnm);
				if(oset!=null) {
					oset.forEach(System.out::println);
				}
				else {
					System.out.println("Not Found");
				}
				
			}
			case 4->{
				
			}
			case 5->{
				
			}
			case 6->{
				
			}
			case 7->{
				sc.close();
				System.out.println("ThankYou for visiting......");
			}
			default->{
				System.out.println("Wrong Choice");
				
			}
			}
		}while(choice!=7);
		

	}

}
