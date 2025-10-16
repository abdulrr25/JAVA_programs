package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import java.util.List;
import java.util.ArrayList;

import com.demo.beans.*;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

static List<Employee> lst;
static {
	lst = new ArrayList<>();
}
	@Override
	public void readData(String fname) {

		File f = new File(fname);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));){
			   while(true) {
				   Employee e=(Employee)ois.readObject();
				   lst.add(e);
			   }
			} catch(EOFException e) {
				System.out.println("Reached to end of file");
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("size: "+lst.size());
	}

	@Override
	public boolean save(Employee e) {
		return lst.add(e);
	}

	@Override
	public boolean DeletebyId(int empid) {
		// TODO Auto-generated method stub
		
		return lst.remove(new Employee(empid));
	}

	@Override
	public boolean UpdateById(int eid, Double sal) {
		// TODO Auto-generated method stub
		int pos=lst.indexOf(new Employee(eid));
		if(pos!=-1) {
			lst.get(pos).setSal(sal);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> FindAll() {
		// TODO Auto-generated method stub
		
		return lst;
	}
	
	

}
