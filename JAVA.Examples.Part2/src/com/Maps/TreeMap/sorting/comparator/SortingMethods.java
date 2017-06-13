package com.Maps.TreeMap.sorting.comparator;

import java.util.Comparator;

public class SortingMethods implements Comparator<Employee>{
		//@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmpid().compareTo(o2.getEmpid());
		}
	}

