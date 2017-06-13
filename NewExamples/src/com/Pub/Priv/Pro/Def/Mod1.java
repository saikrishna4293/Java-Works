package com.Pub.Priv.Pro.Def;

public class Mod1 {

	final int i;
	
	Mod1(){
		i = 20;
	}
	
	public static void main(String[] args) {
		hello obj = new hello();
		obj.method();
		Mod1 obj1 =  new Mod1();
	//  obj1.i=30;
		System.out.println(obj1.i);
		ModifiersUsage obj2 = new ModifiersUsage();
		obj2.method1();		
		obj2.method3();
		obj2.method4();
	
	}

}
