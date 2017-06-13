package com.Sets.sorting;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkSett {
	
	Set<EmployeeLS> link = new LinkedHashSet<EmployeeLS>();
	
	public void names(){
		EmployeeLS e1 = new EmployeeLS(18, "Virat", "Batsman");
		EmployeeLS e2 = new EmployeeLS(07, "Dhoni", "Wicket Keeper");
		EmployeeLS e3 = new EmployeeLS(99, "Ashwin", "All rounder");
		EmployeeLS e4 = new EmployeeLS(01, "Charan", "Actor");
		EmployeeLS e5 = new EmployeeLS(10, "Ironman", "Movie");
		EmployeeLS e6 = new EmployeeLS(18, "Virat", "Batsman");
		link.add(e1);
		link.add(e2);
		link.add(e3);
		link.add(e4);
		link.add(e5);
		link.add(e6);	
	}
	public void call(){
		for (EmployeeLS emp: link) { 
			System.out.println("empid: "+emp.getEmpid()+", ename: "+emp.getEmpname()+", edesignation: "+emp.getEmpdesgn());
		}
	}
	public static void main (String[]args){
			LinkSett obj = new LinkSett();
			obj.names();
			obj.call();
	}
}