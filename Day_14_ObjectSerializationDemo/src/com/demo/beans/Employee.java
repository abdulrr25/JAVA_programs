package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	private int eid;
	private String name;
	private String desg;
	private Double sal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String name, String desg, Double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}
	public Employee(int empid) {
		// TODO Auto-generated constructor stub
		super();
		this.eid=empid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", desg=" + desg + ", sal=" + sal + "]";
	}
	

}
