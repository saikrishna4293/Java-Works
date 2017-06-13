package com.Maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableObEx {

	Map<String, Employ> ht = new Hashtable<String, Employ>();
	
	public void assign(){
		ht.put("V", new Employ(100,"Virat","cricketer"));
		ht.put("S", new Employ(200,"Salman","Bollywood Actor"));
		ht.put("C", new Employ(300,"Charan","Tollywood Actor"));
		ht.put("I", new Employ(400,"Ironaman","Hollywood Movie"));
 		ht.put("V", new Employ(100,"Virat","cricketer"));
 		ht.put("W", new Employ(100,"Virat","cricketer"));
 		//ht.put(null, new Employ(800,"Robert","Hollywood Actor"));
	}
	public void call(){
		Set<String> ob = ht.keySet();
		for (String k : ob){
		Employ empobj = ht.get(k);
		System.out.println("Key is: " +k+", Values are:-- Eid:" +empobj.getEmpid()+", Ename:"+empobj.getEmpname()+
				", "+ "title: " +empobj.getEmpjob());
		}
	}
	public static void main (String[]args){
		HashTableObEx obj = new HashTableObEx();
		obj.assign();
		obj.call();
	}
}
