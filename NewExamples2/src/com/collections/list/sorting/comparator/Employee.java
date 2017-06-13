package com.collections.list.sorting.comparator;

public class Employee{

	private int empid;
	private String empname;
	private String empdesgn;
	
	Employee(int eid, String ename, String edesgn){
		this.empid = eid;
		this.empname = ename;
		this.empdesgn = edesgn;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public String getEmpdesgn() {
		return empdesgn;
	}
}
