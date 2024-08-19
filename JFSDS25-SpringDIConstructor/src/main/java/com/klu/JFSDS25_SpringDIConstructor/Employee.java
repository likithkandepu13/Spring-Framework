package com.klu.JFSDS25_SpringDIConstructor;

public class Employee {
	int eid;
	String ename;
	double esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public Employee(int eid,String ename,double esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}

}
