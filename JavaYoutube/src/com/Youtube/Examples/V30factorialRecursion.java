package com.Youtube.Examples;

public class V30factorialRecursion {

	int  fact(int i){
		if(i<=1)	return 1;
		else return (i* fact(i-1));
	}
	public static void main(String[] args) {
		V30factorialRecursion ob = new V30factorialRecursion();
		System.out.println(ob.fact(5));
	}
}
