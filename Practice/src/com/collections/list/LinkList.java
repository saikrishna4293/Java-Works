package com.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkList {

	List llist = new LinkedList();
	public void assign(){
		llist.add("Virat");//0
		llist.add("Dhoni");//1
		llist.add("Sachin");//2
		llist.add("Yuvraj");//3 -> 2 
		llist.add("Rahul");//4 ->3 ->4
		llist.remove(2);
		llist.add(3,"Ashwin");//3 it  joins in middle (linked)
		
	}
	public void display(){
		for (Object obj : llist) {
			System.out.println(obj.toString());	
		}
	}
	public static void main(String[] args) {
		LinkList ob = new LinkList();
		ob.assign();
		ob.display();
	}

}
