package com.Sets;
import java.util.HashSet;
import java.util.Set;

public class EmpHash2 {
	
	Set<Employee2> hs = new HashSet<Employee2>();
	private int empid;

	public void names(){
		Employee2 e1= new Employee2(100,"Virat","cricketer");
		Employee2 e2= new Employee2(200,"Salman","Bollywood Actor");
		Employee2 e3= new Employee2(700,"Charan","Tollywood Actor");
		Employee2 e4= new Employee2(400,"Ironaman","Hollywood Movie");
		Employee2 e5= new Employee2(900,"Virat","cricketer");
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
	}
	public void display(){
		for (Employee2 empobj : hs) {
			System.out.println("Eid:" +empobj.getEmpid()+", Ename:"+empobj.getEmpname()+", "
					+ "title: " +empobj.getEmpjob());
		}
	}
	public static void main(String[] args) {
		EmpHash2 obj = new EmpHash2();
		obj.names();
		obj.display();
	}
/*	public int compareTo(Employee2 em) {
		return this.empid - em.empid;
	}*/
}
