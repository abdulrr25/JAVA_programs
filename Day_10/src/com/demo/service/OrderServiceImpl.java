package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.dao.OrderDao;

public class OrderServiceImpl implements OrderService {

	@Override
	public boolean addNewCustomer() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id : ");
		int cid=sc.nextInt();
		System.out.println("Enter Name : ");
		String nm=sc.next();
		System.out.println("Enter Mobile: ");
		String mob=sc.next();
		Customer c=new Customer(cid,nm,mob);
		List <Item> lst=new ArrayList<>();
		String ans=null;
		do {
			System.out.println("Enter item id: ");
			int id=sc.nextInt();
			System.out.println("Enter item name: ");
			String inm=sc.next();
			System.out.println("Enter item Quantity: ");
			int qty=sc.nextInt();
			System.out.println("Enter item price: ");
			Double price = sc.nextDouble();
			Item item=new Item(id,inm,qty,price);
			lst.add(item);
			System.out.println("Do you want to continue(y/n)?");
			ans=sc.next();
		
		}while(ans.equals("y"));
		
		
		return false;
	}
	
//	@Override
//	public Map<Customer, List<Item>> displayAll() {
//		return OrderDao.findAll();
//	}


}
