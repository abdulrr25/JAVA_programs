package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.test.TestOrdemgntSystem;

public class OrderDaoImpl implements OrderDao {
	static Map<Customer,List<Item>>hm;
	static {
		hm=new HashMap<>();
		Customer c1=new Customer(10,"Abc","2323" );
		List<Item>lst=new ArrayList<>();
		lst.add(new Item(1001,"Chair",34,5678));
		lst.add(new Item(1002,"Table", 30,5432));
		hm.put(c1, lst);
		
		Customer c2=new Customer(11, "xyz", "1212");
		List<Item>lst1 =new ArrayList<>();
		lst.add(new Item(1001, "Shelf", 40, 2435));
		lst.add(new Item(1002, "Drawer", 20, 3452));
		hm.put(c2, lst1);
		
	}

	@Override
	public boolean save(Customer c, List<Item> lst) {
		// TODO Auto-generated method stub
		if(!hm.containsKey(c)){
			hm.put(c,lst);
			return true;
		}
		return false;
	}

	@Override
	public Map<Customer, List<Item>> findAll() {
		// TODO Auto-generated method stub
		return hm;
	}

	@Override
	public Set<Customer> findByName(Object nm) {
		// TODO Auto-generated method stub
//		Set<Customer> os = oset.stream().filter(o->o.getOname().equals(cnm).collect(Collectors.toSet()));
//		if(os.size()>0) {
//			return os;
//		}
		return null;
	}
	

}
