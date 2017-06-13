package com.zz.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialEx {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee(10, "Saikrishna", "Software Engineer");
		
		FileOutputStream fout = new FileOutputStream("D:\\Saikrishna.txt");
		ObjectOutputStream oout =  new ObjectOutputStream(fout);
		oout.writeObject(emp);
		oout.flush();
		System.out.println("Done Execution");
		 
	}

}
