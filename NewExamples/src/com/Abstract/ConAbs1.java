package com.Abstract;

public class ConAbs1  extends Abs1 {

	public static void main(String[] args) {
		ConAbs1 ob = new ConAbs1();
		ob.method1();
		ob.method2();
		ob.methodIns("hello");
	}

	public void method1() {
		System.out.println("im from Abs 1 m1");
	}

	void method2() {
		System.out.println("im from Abs 1 m2");
	}
	
	protected void method3() {
		
	}

	public void methodIns(String str) {
		System.out.println("im from Inter 1");		
	}

	

}
