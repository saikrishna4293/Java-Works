package com.Sets.sorting;

import java.util.Set;
import java.util.TreeSet;

public class TreeSett2 {
	
	Set<EmployeeTS> tree = new TreeSet<EmployeeTS>();
		
	public void names(){
		EmployeeTS e1 = new EmployeeTS(18, "Virat", "Batsman");
		EmployeeTS e2 = new EmployeeTS(07, "Dhoni", "Wicket Keeper");
		EmployeeTS e3 = new EmployeeTS(99, "Ashwin", "All rounder");
		EmployeeTS e4 = new EmployeeTS(01, "Charan", "Actor");
		EmployeeTS e5 = new EmployeeTS(10, "Ironman", "Movie");
		EmployeeTS e6 = new EmployeeTS(18, "Virat", "Batsman");
		tree.add(e1);
		tree.add(e2);
		tree.add(e3);
		tree.add(e4);
		tree.add(e5);
		tree.add(e6);	
	}
	public void call(){
		for (EmployeeTS emp: tree) { 
			System.out.println("empid: "+emp.getEmpid()+", ename: "+emp.getEmpname()+", edesignation: "+emp.getEmpdesgn());
		}
	}
	public static void main (String[]args){
			TreeSett2 obj = new TreeSett2();
			obj.names();
			obj.call();
	}
}