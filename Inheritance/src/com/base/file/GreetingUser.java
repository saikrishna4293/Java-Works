package com.base.file;

import com.Inherit2.ValidateUser;


public class GreetingUser extends ValidateUser {
	
	int c=200;
	
	public static void main(String[] args) {
		GreetingUser obj1 = new GreetingUser();
		obj1.method1();
		GreetingUser obj2 = new GreetingUser();
		obj2.method2();		
		
		obj2.methodVal1();
		obj1.methodVal2();
	}
	
	public void method1() {
		System.out.println("Hi hello im inherited from same package diff interface");		
	}

	public void method2() {
		System.out.println("Hi im method2");		
	}

}
