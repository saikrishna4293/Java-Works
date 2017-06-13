package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrListEx2 {
	
	List alist = new ArrayList();
	
	public void assign(){
		alist.add("Virat");//0
		alist.add("Dhoni");//1
		alist.add("Sachin");//2
		alist.add("Yuvraj");//3->4
		alist.add("Rahul");//4->out
		alist.remove(4);
		alist.add(3,"Ashwin");//3
		alist.add(new ArrListEx2()); 
	}
	public void display(){
		for (int i=0;i<alist.size(); i++) {
			Object ob = alist.get(i);
			if (ob instanceof String){
				String str = (String) alist.get(i);
				System.out.println(str);
			}
			if (ob instanceof ArrListEx2){
				ArrListEx2 obj = (ArrListEx2) alist.get(i);
				System.out.println(obj);
			}
		}
	}
	public static void main(String[] args) {
		ArrListEx2 ob = new ArrListEx2();
		ob.assign();
		ob.display();
		System.out.println("Program executed successfully");
		//System.out.println(alist.get(2));
	}
}
