package com.zz.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialObjectEx {

	public static void main(String[] args) throws IOException {

		List<Employee> alist = new  ArrayList<Employee>();
		
		Employee e1 = new Employee(10, "Saikrishna", "Software Engineer");
		Employee e2 = new Employee(20, "Vishnu", "Database Developer");
		Employee e3 = new Employee(30, "Aditya", "MSBI");
		Employee e4 = new Employee(40, "Sidhartha", "Java Developer");
		alist.add(e1);
		alist.add(e2);
		alist.add(e3);
		alist.add(e4);
		
		FileOutputStream fout = new FileOutputStream("D:\\Saikrishna.txt");
		for (Employee emp : alist) {
			ObjectOutputStream oout =  new ObjectOutputStream(fout);
			oout.writeObject(alist);
			oout.flush();
		}
		System.out.println("Done Execution");	 
	}

}
