package com.Sets.sorting.comparator;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx implements Comparable<Employee> {
	
	Set<Employee> hs = new HashSet<Employee>();
	private int empid;
	public void names(){
		Employee e1= new Employee(100,"Virat","cricketer");
		Employee e2= new Employee(200,"Salman","Bollywood Actor");
		Employee e3= new Employee(300,"Charan","Tollywood Actor");
		Employee e4= new Employee(400,"Ironaman","Hollywood Movie");
		Employee e5= new Employee(100,"Virat","cricketer");
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
	}
	public void display(){
		for (Employee empobj : hs) {
			System.out.println("Eid:" +empobj.getEmpid()+", Ename:"+empobj.getEmpname()+", "
					+ "title: " +empobj.getEmpjob());
		}
	}
	public static void main(String[] args) {
		HashSetEx obj = new HashSetEx();
		obj.names();
		obj.display();
	}
	//@Override
		public int compareTo(Employee e) {
			return this.empid - e.empid;	
	}
}
