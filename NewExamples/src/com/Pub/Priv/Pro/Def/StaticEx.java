package com.Pub.Priv.Pro.Def;

public class StaticEx {

	static int i = 50;
	int j = 2;
	
	public void method1(){
		String s= "test";
		String s1 ="Test2";
		System.out.println(s);
		s = s1;
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		StaticEx ob = new StaticEx();
		System.out.println(ob.i);
		i= 100;
		StaticEx ob2 = new StaticEx();
		System.out.println(i);
		i = 200;
		System.out.println(ob2.j);
		int j= 4;
		System.out.println(ob2.j);
		System.out.println(j);
		System.out.println(ob2.i);
		i = 400;
		ob.method();		
		ob.method1();
	}
	public void method(){
		System.out.println(i);
	}

}
