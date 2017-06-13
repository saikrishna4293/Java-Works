package com.Sets.sorting;

import java.util.HashSet;
import java.util.Set;

public class HashSett {
	
	Set<EmployeeHS> hash = new HashSet<EmployeeHS>();
	
	public void names(){
		EmployeeHS e1 = new EmployeeHS(18, "Virat", "Batsman");
		EmployeeHS e2 = new EmployeeHS(07, "Dhoni", "Wicket Keeper");
		EmployeeHS e3 = new EmployeeHS(99, "Ashwin", "All rounder");
		EmployeeHS e4 = new EmployeeHS(01, "Charan", "Actor");
		EmployeeHS e5 = new EmployeeHS(10, "Ironman", "Movie");
		EmployeeHS e6 = new EmployeeHS(18, "Virat", "Batsman");
		hash.add(e1);
		hash.add(e2);
		hash.add(e3);
		hash.add(e4);
		hash.add(e5);
		hash.add(e6);	
	}
	public void call(){
		for (EmployeeHS emp: hash) { 
			System.out.println("empid: "+emp.getEmpid()+", ename: "+emp.getEmpname()+", edesignation: "+emp.getEmpdesgn());
		}
	}
	public static void main (String[]args){
			HashSett obj = new HashSett();
			obj.names();
			obj.call();
	}
}
