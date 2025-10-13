package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    static List<Employee> elist;
    static {
    	elist=new ArrayList<>();
    	elist.add(new Employee(100,"Manjiri",45678,LocalDate.of(2024, 11, 12)));
    	elist.add(new Employee(101,"Gauri",55678,LocalDate.of(2023, 11, 12)));
    	elist.add(new Employee(103,"Kanchan",35678,LocalDate.of(2020, 11, 12)));
    	
    }
	@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
		
	}
	@Override
	public List<Employee> findAll() {
		return elist;
	}
	@Override
	public Employee findById(int eid) {

		int pos=elist.indexOf(new Employee(eid));
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}
	@Override
	public boolean removeById(int eid) {

		return elist.remove(new Employee(eid));
	}
	@Override
	public List<Employee> findByName(String nm) {
		
		List<Employee> temp= elist.stream()
		                    .filter(emp->emp.getEname().equals(nm))
		                    .collect(Collectors.toList());
		
		if(temp.size()>0) {
			return temp;
		}
		return null;
	}
	@Override
	public boolean updateSal(int id, double sal) {
		// TODO Auto-generated method stub
		Employee e=findById(id);
		if(e!=null) {
			
		e.setSal(sal);
		return true;
		}
		return false;
	}
	@Override
	public boolean deleteBySalary(double sal) {
		// TODO Auto-generated method stub
		
		return elist.removeIf(emp->emp.getSal()>sal);
	}
	@Override
	public List<Employee> searchBySalary(double sal) {
		// TODO Auto-generated method stub
		List<Employee> lst = elist.stream().filter(emp->emp.getSal()==sal).collect(Collectors.toList());
		
		return lst;
	}
	@Override
	public List<Employee> sortBySalary() {
		// TODO Auto-generated method stub
		List<Employee> lst = new ArrayList<>();
		for(Employee e :elist) {
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}
	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		List<Employee> lst=new ArrayList<>();
		for(Employee e:elist){
			lst.add(e);
		}
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("In functional comparator");
			return o1.getEname().compareTo(o2.getEname());
		
			
			
		};
		lst.sort(c);
		
		return lst;
	}
	private Employee getEname() {
		// TODO Auto-generated method stub
		return null;
	}

}
