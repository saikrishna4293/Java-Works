package com.Abstract;

public abstract class Abs1 implements Inter1 {

	public abstract void method1();
	
	abstract void method2();
	
	protected abstract void method3();//only public or protected or default not private
	
	public static void main (String[]args){
		//Abs1 ob = new Abs1();
		System.out.println("hello");
	}
}
