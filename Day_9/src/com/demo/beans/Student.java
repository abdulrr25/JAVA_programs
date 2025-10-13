package com.demo.beans;

import java.time.LocalDate;

public class Student implements Comparable<Student>{
	private int rollno;
	private String sname;
	private double percentage;
	private LocalDate adt;
	public Student() {
		super();
	}
	public Student(int rollno, String sname,double percentage, LocalDate adt) {
		this.rollno=rollno;
		this.sname=sname;
		this.percentage = percentage;
		this.adt=adt;
	}
	public Student(int rollno) {
		// TODO Auto-generated constructor stub
		super();
		this.rollno=rollno;
	}
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollno);
    }
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public LocalDate getAdt() {
		return adt;
	}
	public void setAdt(LocalDate adt) {
		this.adt = adt;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", percentage=" + percentage + ", adt=" + adt + "]";
	}

	@Override
	public int compareTo(Student o) {
		System.out.println("in compareTo method "+this.percentage+"-----"+o.percentage);
		//return o.empid-this.empid; //descending order
		return (int) (this.percentage-o.percentage);
	}
}