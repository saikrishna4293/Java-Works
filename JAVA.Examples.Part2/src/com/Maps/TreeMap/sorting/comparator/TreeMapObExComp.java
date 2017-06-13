package com.Maps.TreeMap.sorting.comparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapObExComp {

	Map<Employee, Employ> t = new TreeMap<Employee, Employ>(new SortingMethods());
	
	public void assign(){
		t.put(new Employee("b","Robert DJ","Hollywood Actor"), new Employ(200,"Robert DJ","Hollywood Actor"));
		t.put(new Employee("a","Salman","Bollywood Actor"), new Employ(100,"Salman","Bollywood Actor"));
		t.put(new Employee("z","Charan","Tollywood Actor"), new Employ(500,"Charan","Tollywood Actor"));
		t.put(new Employee("c","Ironaman","Hollywood Movie"), new Employ(300,"Ironaman","Hollywood Movie"));
 		t.put(new Employee("d","Virat Kohli","cricketer"), new Employ(400,"Virat Kohli","cricketer"));
 		t.put(new Employee("d","Virat Kohli","cricketer"), new Employ(400,"Virat Kohli","cricketer"));
      //t.put(new Employee(null,"Robert","Hollywood Actor"), new Employ(800,"Robert","Hollywood Actor"));
	}
	public void call(){
		Set<Employee> ob = t.keySet();
		for (Employee key : ob){
		Employ empobj = t.get(key);
		Employee emp = key;
		System.out.println("Key is: " +emp.getEmpid()+", Values are:-- Eid:" +empobj.getEmpid()+", Ename:"+empobj.getEmpname()+
				", "+ "title: " +empobj.getEmpjob());
		}
	}
	public static void main(String[]args){
		TreeMapObExComp obj = new TreeMapObExComp();
		obj.assign();
		obj.call();
	}
}

