package com.Maps;

public class Employ {
	int empid;
	String empname;
	String empjob;
	
	public Employ(int eid, String ename, String ejob){
		this.empid = eid;
		this.empname = ename;
		this.empjob = ejob;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	public String getEmpjob() {
		return empjob;
	}
}