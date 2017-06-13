package com.Inherit2;

public class ValidateUser {

	final int b=100;
	
	public void methodVal1(){
		System.out.println("method executed from values");
	}
	public void methodVal2(){
		int i=10;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		ValidateUser valObj1 = new ValidateUser();
		System.out.println(valObj1.b);
	
	}

}
