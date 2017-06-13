package com.collections.list.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArListSort {

	List<Employee> alist = new ArrayList<Employee>();
	
	public void initiate(){
		Employee e1 = new Employee(18, "Virat", "Batsman");
		Employee e2 = new Employee(07, "Dhoni", "Wicket Keeper");
		Employee e3 = new Employee(99, "Ashwin", "All rounder");
		Employee e4 = new Employee(01, "Charan", "Actor");
		Employee e5 = new Employee(10, "Ironman", "Movie");
		Employee e6 = new Employee(18, "Virat", "Batsman");
		alist.add(e1);
		alist.add(e2);
		alist.add(e3);
		alist.add(e4);
		alist.add(e5);
		alist.add(e6);		
	}
	public void display(){
		Collections.sort(alist, new SortingMethods()); // sort by eid (other class) we can write anywhere 
		//Collections.sort(alist, new SortingEname());   // sort by ename (its in same class) but give where to go
		//Collections.sort(alist, new SortingEdesgn());  // sort by edesgn (other class)
		for (Employee emp: alist) { 
			System.out.println("empid: "+emp.getEmpid()+", ename: "+emp.getEmpname()+", edesignation: "+emp.getEmpdesgn());
		}
	}
	public static void main(String[]args){
		ArListSort ob = new ArListSort();
		ob.initiate();
		ob.display();
	}
}

class SortingEname implements Comparator<Employee>{
	//@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpname().compareTo(o2.getEmpname());
	}	
}