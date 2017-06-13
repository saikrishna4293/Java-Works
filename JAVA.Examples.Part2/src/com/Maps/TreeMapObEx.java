package com.Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapObEx {

	Map<String, Employ> t = new TreeMap<String, Employ>();
	
	public void assign(){
		t.put("V", new Employ(100,"Virat","cricketer"));
		t.put("S", new Employ(200,"Salman","Bollywood Actor"));
		t.put("C", new Employ(300,"Charan","Tollywood Actor"));
		t.put("I", new Employ(400,"Ironaman","Hollywood Movie"));
 		t.put("V", new Employ(100,"Virat","cricketer"));
 		t.put("W", new Employ(100,"Virat","cricketer"));
 		//t.put(null, new Employ(800,"Robert","Hollywood Actor"));
	}
	public void call(){
		Set<String> ob = t.keySet();
		for (String k : ob){
		Employ empobj = t.get(k);
		System.out.println("Key is: " +k+", Values are:-- Eid:" +empobj.getEmpid()+", Ename:"+empobj.getEmpname()+
				", "+ "title: " +empobj.getEmpjob());
		}
	}
	public static void main(String[]args){
		TreeMapObEx obj = new TreeMapObEx();
		obj.assign();
		obj.call();
	}
}

