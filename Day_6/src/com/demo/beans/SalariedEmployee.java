package com.demo.beans;
import java.util.Date;

public class SalariedEmployee extends Employee{
	private double sal;
	private double bonus;
	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(String pname, Date bdate,String dept, String desg,double sal) {
		super("s",pname,bdate,dept,desg);
		this.sal = sal;
		this.bonus = sal*0.10;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double calculateBonus(float percent) {
		bonus=sal*percent;
		return bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	@Override
	public double calculateSal() {
		return bonus+sal+0.10*sal+0.15*sal-0.08*sal;
	}
	

}
