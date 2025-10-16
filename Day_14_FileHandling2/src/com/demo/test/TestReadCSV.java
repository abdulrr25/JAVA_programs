package com.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.*;

public class TestReadCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> lst = new ArrayList<>();
		try(
				BufferedReader br=new BufferedReader(new FileReader("myfile.txt"));){
			String line=br.readLine();
			while(line!=null) {
				String[] arr=line.split(",");
				Employee emp=new Employee();
				emp.setEid(Integer.parseInt(arr[0]));
				emp.setName(arr[1]);
				emp.setDesg(arr[2]);
				emp.setSal(Double.parseDouble(arr[3]));
				lst.add(emp);
				line=br.readLine();
			}
			lst.forEach(System.out::println);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lst.add(new Employee(334,"aakanksha","admin",54611.0));
		try(BufferedWriter bw=new BufferedWriter (new FileWriter("myfile.txt"));){
			for(Employee e:lst) {
				String str=e.getEid()+","+e.getName()+","+e.getDesg()+","+e.getSal()+"\n";
				bw.write(str);
			}
			}catch(IOException e) {
				System.out.println(e.getMessage());
		}
		

	}

}
