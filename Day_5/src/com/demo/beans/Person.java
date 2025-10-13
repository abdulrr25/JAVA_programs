package com.demo.beans;

import java.util.Date;

public class Person {
	static int scount,vcount,ccount;
	static {
		scount =0;
		vcount=0;
		ccount=0;
	}
	private String pid;
	private String pname;
	private Date bdate;
	public Person() {
		super();
		
		System.out.println("in Person default constrctor");

		pid = generateId("s");
		pname=null;
		bdate=null;
	}
	public Person(String empType, String pname, Date bdate) {
		super();
		pid = generateId(empType);
		this.pname = pname;
		this.bdate = bdate;
	}
	private String generateId(String empType) {
		if(empType.equals("v")) {
			scount++;
			return empType+scount;  
		}
		else if(empType.equals("v")) {
			vcount++;
			return empType+vcount;
		}
		else if(empType.equals("c")) {
			ccount++;
			return empType+ccount;
		}
		return null;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", bdate=" + bdate + "]";
	}
	
}
