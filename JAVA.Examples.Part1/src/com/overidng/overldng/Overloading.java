package com.overidng.overldng;

public class Overloading {

	public void m1(){
		System.out.println("hi im first");
	}
	protected void m1(String string){
		System.out.println("hi im second");
	}
	private float m1(int i){
		System.out.println("hi im third");
		return 3.43f;
	}
	int m1(String str1, int g){
		System.out.println("hi im fourth combination");
		return 10;
	}
	public void m2(){
		System.out.println("m2 emptymethod");
	}
	protected int m2(int j){
		System.out.println("m2 integer");
		return 80;
	}
	public static void main (String args[]){
		Overloading obj = new Overloading();
		obj.m1();
		obj.m1(10);
		obj.m1("hello");
		obj.m1("hi", 10);
		obj.m2();
		obj.m2(5);
	}

}
