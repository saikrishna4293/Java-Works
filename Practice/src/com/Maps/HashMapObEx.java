package com.Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapObEx {
	
	Map<String, Employ > hsm = new HashMap<String, Employ>();
 	public void names(){
 		hsm.put("V", new Employ(100,"Virat","cricketer"));
 		hsm.put("S", new Employ(200,"Salman","Bollywood Actor"));
 		hsm.put("C", new Employ(300,"Charan","Tollywood Actor"));
 		hsm.put("I", new Employ(400,"Ironaman","Hollywood Movie"));
 		hsm.put("V", new Employ(100,"Virat","cricketer"));
 		hsm.put("W", new Employ(100,"Virat","cricketer"));
 		hsm.put(null, new Employ(800,"Robert","Hollywood Actor"));

	}
	public void display(){
		Set<String> keys = hsm.keySet();
		for (String key : keys) {
			Employ empobj = hsm.get(key);
			System.out.println("Key is: " +key+", Values are:-- Eid:" +empobj.getEmpid()+", Ename:"+empobj.getEmpname()+", "
					+ "title: " +empobj.getEmpjob());
		}
	}
	public static void main(String[] args) {
		HashMapObEx obj = new HashMapObEx();
		obj.names();
		obj.display();
	}
}