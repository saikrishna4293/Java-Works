package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrListEx {

	List<String> alist = new ArrayList<String>();
	
	public void assign(){
		//try{
			alist.add("Virat");//0
			alist.add("Dhoni");//1
			alist.add("Sachin");//2
			alist.add("Yuvraj");//3->4
			alist.add("Rahul");//4->out
			//alist.remove(4);
			alist.add(3,"Ashwin");//3
			//alist.add(new ArrayList());	
		//}catch (ClassCastException c){
		//	System.out.println("their is a class object in it");
		//}
	}
	public void display(){
		for(int i=0; i <alist.size();i++){
			String str = (String) alist.get(i);
			System.out.println(str);
		}
		System.out.println(alist.size());
	}
	public static void main(String[] args) {
		ArrListEx ob = new ArrListEx();
		ob.assign();
		ob.display();
		System.out.println("Program executed successfully");
		//System.out.println(alist.get(2));
	}
}
