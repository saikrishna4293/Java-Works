package com.Sets.sorting;

public class EmployeeHS {
	
	private int empid;
	private String empname;
	private String empdesgn;
	
	EmployeeHS(int eid, String ename, String edesgn){
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

//@Override
public int hashCode(){
	int code=0;
	for(int i=0;i<empname.length();i++){
		int asciVal = empname.charAt(i);
		code= code+asciVal;
	}return code;
}
//@Override
public boolean equals(Object ob){
	EmployeeHS em = (EmployeeHS) ob;
	return this.empname.equals(em.empname);
	}
}