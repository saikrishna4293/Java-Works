package com.Maps.TreeMap.sorting.comparator;

public class Employee{

	private String empid;
	private String empname;
	private String empdesgn;
	
	Employee(String eid, String ename, String edesgn){
		this.empid = eid;
		this.empname = ename;
		this.empdesgn = edesgn;
	}
	public String getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public String getEmpdesgn() {
		return empdesgn;
	}
}
