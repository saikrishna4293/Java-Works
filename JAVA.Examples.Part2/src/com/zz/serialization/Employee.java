package com.zz.serialization;

import java.io.Serializable;

public class Employee implements Serializable   {

	private int empid;
	private String empname;
	private transient String empdesgn;
	
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
/*	public int compareTo(Employee e) {
		return this.empid - e.empid;         					       //sorting based on id
		//return this.empname.compareTo(e.empname);     //sorting based on name
		//return this.empdesgn.compareTo(e.empdesgn);	   //sorting based on designation
	}
*/
}
