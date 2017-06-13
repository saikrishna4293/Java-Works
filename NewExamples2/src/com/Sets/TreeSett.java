package com.Sets;

import java.util.Set;
import java.util.TreeSet;


public class TreeSett {
Set<String> Tree = new TreeSet<String>();
	
	public void names(){
		Tree.add("virat");
		Tree.add("Sachin");
		Tree.add("Dhoni");
		Tree.add("Yuvraj");
		Tree.add("Rohith");
		Tree.add("virat");		
	}
	
	public void call(){
		for (String Str1 : Tree) {
			System.out.println(Str1);
		}
	}
	public static void main(String[] args) {
		TreeSett obj = new TreeSett();
		obj.names();
		obj.call(); 
	}
}
