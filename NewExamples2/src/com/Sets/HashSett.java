package com.Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSett {

	Set<String> hash = new HashSet<String>();
	
	public void names(){
		hash.add("virat");
		hash.add("Sachin");
		hash.add("Dhoni");
		hash.add("Yuvraj");
		hash.add("Rohith");
		hash.add("virat");		
	}
	public void call(){
		for (String Str1 : hash) {
			System.out.println(Str1);
		}
	}
	public static void main (String[]args){
			HashSett obj = new HashSett();
			obj.names();
			obj.call();
	}
}
