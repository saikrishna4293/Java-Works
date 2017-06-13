package com.zz.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("D:\\saikrishna.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		 System.out.println("eid: "+emp.getEmpid()+",  ename: "+ emp.getEmpname()+", Designation: "+emp.getEmpdesgn());		
	}

}
