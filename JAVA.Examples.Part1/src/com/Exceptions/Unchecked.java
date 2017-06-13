package com.Exceptions;

public class Unchecked {

	String str = "hello";
	String str2;
	public void method1(){
		try{
			System.out.println(str.length());
		}catch(NullPointerException n){
			System.out.println("its a null value dude");
		}
	}
	public void method2(){
		try{
			System.out.println(str2.length());
		}catch (Exception e){
			System.out.println("null vaue in exception");
		}
	}
	public void method3(){
		try{
			int i= Integer.parseInt(str);
		}catch(NumberFormatException f){
			System.out.println("we can not convert string to number");
		}
	}
	public static void main(String[] args) {
		Unchecked ob = new Unchecked();
		ob.method1();
		ob.method2();
		ob.method3();
	}

}
