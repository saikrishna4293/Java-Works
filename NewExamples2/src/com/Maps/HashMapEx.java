package com.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	Map<String, String> mob = new HashMap<String, String>();
	
	public void assign(){
		mob.put("V","Virender sehwag");
		mob.put("V","Virat");
		mob.put("I","Virat");
		mob.put("C","Charan");
		mob.put("S","Sharukh");
		mob.put("M","Modiji");
		mob.put("A","Abdul");
		mob.put(null, "nullValue");
	}
	public void display(){
		Set<String> ob = mob.keySet();
		for (String key : ob){
			System.out.println("key is: " + key + ",  and key Value is: " +mob.get(key));
		}
	}
	public static void main (String[] args){
		HashMapEx hs = new HashMapEx();
		hs.assign();
		hs.display();
	}
}
