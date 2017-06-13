package com.email.inhertance;

public class Child extends Parent {

	public static void main(String[] args) {
		Parent b = new Parent();
		System.out.println("Calling from base class");
		b.pmethod();
		
		Child c = new Child();
		System.out.println("calling from child class");
		c.pmethod();
		
		System.out.println(c.i);
	}

}
