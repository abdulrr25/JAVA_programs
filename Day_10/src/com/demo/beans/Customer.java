package com.demo.beans;

public class Customer {
	private int cid;
	private String cname;
	private String Mob;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, String mob) {
		super();
		this.cid = cid;
		this.cname = cname;
		Mob = mob;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMob() {
		return Mob;
	}
	public void setMob(String mob) {
		Mob = mob;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", Mob=" + Mob + "]";
	}
	

}
