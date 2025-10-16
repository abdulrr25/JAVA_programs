package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.*;

public class TestSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> lst=new ArrayList<>();
		lst.add(new Employee(11,"Ashutosh","AI",56789));
		lst.add(new Employee(12,"abc","Manager",56745));
		lst.add(new Employee(13,"xyz","Assistant",5634));
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empdataa.txt"));){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdataa.txt"))){
			
			while(true) {
				Employee e=(Employee)ois.readObject();
				System.out.println(e);
			}
			
		}
catch(EOFException e) {
	System.out.println(e.getMessage());
}

catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
