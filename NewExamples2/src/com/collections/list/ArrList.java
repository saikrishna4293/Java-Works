package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrList {

	static List alist = new ArrayList();
	
	public void assign(){
		alist.add("Virat");//0
		alist.add("Dhoni");//1
		alist.add("Sachin");//2
		alist.add("Yuvraj");//3->4
		alist.add("Rahul");//4->out
		alist.remove(4);
		alist.add(3,"Ashwin");//3
	}
	public void display(){
		for (Object obj : alist) {
			System.out.println(obj.toString());	
		}
	}
	public void display2(){
		ListIterator itr = alist.listIterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
				
	}
	public static void main(String[] args) {
		ArrList ob = new ArrList();
		ob.assign();
		ob.display();
		System.out.println("*************************");
		ob.display2();
		System.out.println("*************************");
		System.out.println("Program executed successfully");
		System.out.println(alist.get(2));

	}

}
