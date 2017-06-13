package com.Sets;

public class Employee2 {

	int empid;
	String empname;
	String empjob;
	
	Employee2 (int eid, String ename, String ejob){
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
	//@Override
	public int hashCode(){
		int code = 0;
		for (int i=0; i<empname.length();i++){
			int asciValue = empname.charAt(i);
			code = code + asciValue;
		}
		return code;
	}
	//@Override
	public boolean equals(Object obj){
		Employee2 emp = (Employee2) obj;
		return this.empname.equals(emp.empname);
	}
}
