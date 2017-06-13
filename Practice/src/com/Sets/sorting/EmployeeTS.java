package com.Sets.sorting;

public class EmployeeTS implements Comparable<EmployeeTS> {
		
	private int empid;
	private String empname;
	private String empdesgn;
	
	EmployeeTS(int eid, String ename, String edesgn){
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


public int compareTo(EmployeeTS o) {
	return this.empname.compareTo(o.empname);
}
}