package com.Pub.Priv.Pro.Def;

public class StaticEx {

	static int i = 50;
	int j = 2;
	/*final int l;
	StaticEx(){
		l =10;
	}*/
	public void method1(){
		String s= "test";
		String s1 ="Test2";
		System.out.println(s);
		s = s1;
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		StaticEx ob = new StaticEx();
	//	System.out.println(ob.i);
	//	ob.i= 100;
		StaticEx ob2 = new StaticEx();
	//	System.out.println(i);
	//	ob2.i = 200;
		//System.out.println(ob2.j);
		//int j= 4;
		int j = 4;
		ob.j = 5;
		System.out.println(j);
		System.out.println(ob.j);
		System.out.println(ob2.j);
		System.out.println(ob2.i);
		i = 400;
		ob.method();		
		ob.method1();
	}
	public void method(){
		System.out.println(i);
	}

}
