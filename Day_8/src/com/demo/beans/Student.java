package com.demo.beans;

public class Student {

	private int id;
	private String nm;
	private int m1;
	private int m2;
	private int m3;
	public Student() {
		super();
	}
	public Student(int id, String nm, int m1, int m2, int m3) {
		super();
		this.id = id;
		this.nm = nm;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public Student(int id) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nm=" + nm + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	

}
