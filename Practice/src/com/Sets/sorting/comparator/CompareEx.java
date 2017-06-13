package com.Sets.sorting.comparator;
import java.util.Comparator;

public class CompareEx implements Comparator<Employee>{

	//@Override
	public int compare(Employee e1, Employee e2) {
	return e1.getEmpid()- e2.getEmpid();
	}
}
class TreeComparatorDataByName implements Comparator<Employee>{
	//@Override
	public int compare(Employee e1, Employee e2) {
	return e1.getEmpname().compareTo(e2.getEmpname());
	}
}
