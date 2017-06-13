package com.Sets;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSett {
	
	Set<String> Linked = new LinkedHashSet<String>();
	
	public void names(){
		Linked.add("virat");
		Linked.add("Sachin");
		Linked.add("Dhoni");
		Linked.add("Yuvraj");
		Linked.add("Rohith");
		Linked.add("virat");		
	}
	
	public void call(){
		for (String Str1 : Linked) {
			System.out.println(Str1);
		}
	}

	public static void main(String[] args) {
		LinkedHashSett obj = new LinkedHashSett();
		obj.names();
		obj.call(); 
	}

}

