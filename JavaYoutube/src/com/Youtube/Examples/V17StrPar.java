package com.Youtube.Examples;

public class V17StrPar {

	 int i = 10;
	 int j = 20;
	
	public void method(String str){
		System.out.println("String:  "+str);
		System.out.println(i);
	}
	public void addmeth(int a, int b, int c){
		System.out.println(a+b+c);
	}
	public int addmeth2(int a, int b, int c){
		return a+b+c;	
	}
	
	public static void main(String[] args) {
		
		V17StrPar ob = new V17StrPar();
		ob.i=ob.j;
		ob.method("saikrishna");
		ob.method("java programmer");	
		ob.addmeth(4, 5, 6);
		ob.addmeth(1, 2, 3);
		System.out.println(ob.addmeth2(1, 2, 3));
		
	}
}
