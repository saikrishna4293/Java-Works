package com.collections.list.sorting.comparator;

import java.util.Comparator;

public class SortingMethods implements Comparator<Employee>{
	//@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpid()-o2.getEmpid();
	}
}

class SortingEdesgn implements Comparator<Employee>{
	//@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpdesgn().compareTo(o2.getEmpdesgn());
	}
	
}