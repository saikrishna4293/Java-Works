package com.Youtube.Examples;

public class V30factorial {

	void method(int i){
		int x=1;
		while(i >=1){
			System.out.println(x+" * "+i+" = "+(x=i--*x));
		}
	}
	void method2(int i){
		int x=1;
		while(i>=1){
			x=i--*x;
		}System.out.println(x);
	}
	
	public static void main(String[] args) {
		V30factorial ob = new V30factorial();
		//ob.method(5);
		ob.method2(5);
		
	}

}
